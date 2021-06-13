package Main;

import Main.Dto.User;
import Main.Repositories.UserRepository;
import Main.proto.*;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@GrpcService
public class CRUDServiceImpl extends CRUDServiceGrpc.CRUDServiceImplBase  {

    @Autowired
    UserRepository userRepository;

    @Override
    public void readUser(UserRequestId request, StreamObserver<userProto> responseObserver) {
        Optional<User> optionalUser = userRepository.findById(Integer.valueOf(request.getUserId()));
        if(optionalUser.get() == null)
            throw new RuntimeException("User with ID: " + request.getUserId() + " Not Found");
        User user = optionalUser.get();

        userProto userP = userProto.newBuilder()
                .setFirstName(user.getFirstName())
                .setLastName(user.getLastName())
                .setUserId(user.getIdUser())
                .setEmail(user.getEmail())
                .build();

        responseObserver.onNext(userP);
        responseObserver.onCompleted();

    }

    @Override
    public void createUSer(userRequest request, StreamObserver<userProto> responseObserver) {
        User user= new User();

        user.setFirstName(request.getFirstName());
        user.setLastName(request.getLastName());
        user.setPassword(request.getPassword());
        user.setEmail(request.getEmail());

        User storedUserDetails = userRepository.save(user);

        userProto userP = userProto.newBuilder()
                .setFirstName(storedUserDetails.getFirstName())
                .setUserId(storedUserDetails.getIdUser())
                .setLastName(storedUserDetails.getLastName())
                .setEmail(storedUserDetails.getEmail())
                .build();

        responseObserver.onNext(userP);
        responseObserver.onCompleted();

    }

    @Override
    public void updateUSer(UserUpdate request, StreamObserver<userProto> responseObserver) {

        Optional<User> optionalUser = userRepository.findById(Integer.valueOf(request.getUserId()));
        if(optionalUser == null) throw new RuntimeException("User with ID: " + request.getUserId() + " Not Found");

        User user = optionalUser.get();
        user.setFirstName(request.getUserDetails().getFirstName());
        user.setLastName(request.getUserDetails().getLastName());
        user.setEmail(request.getUserDetails().getEmail());
        user.setPassword(request.getUserDetails().getPassword());

        User updatedUserDetails = userRepository.save(user);

        userProto userP = userProto.newBuilder()
                .setUserId(updatedUserDetails.getIdUser())
                .setFirstName(updatedUserDetails.getFirstName())
                .setLastName(updatedUserDetails.getLastName())
                .setEmail(updatedUserDetails.getEmail())
                .build();

        responseObserver.onNext(userP);
        responseObserver.onCompleted();

    }

    @Override
    public void deleteUser(UserRequestId request, StreamObserver<OperationalStatusProto> responseObserver) {
        Optional<User> user = userRepository.findById(Integer.valueOf(request.getUserId()));

        if(user == null) {
            responseObserver.onError(new RuntimeException("User with ID: " + request.getUserId() + " Not Found"));
        }else{
            userRepository.delete(user.get());

            OperationalStatusProto operationalStatusProto = OperationalStatusProto.newBuilder()
                    .setOperationName("DELETE")
                    .setOperationResult("SUCCES")
                    .build();
            responseObserver.onNext(operationalStatusProto);
            responseObserver.onCompleted();
        }

    }

    @Override
    public void readListUser(UserListLimit request, StreamObserver<UserRestProtoColl> responseObserver) {
        int page;
        int limit;
        List<userProto> userRestProtoList = new ArrayList<>();
        page = request.getPage();
        limit = request.getLimit();

        if(page>0) page = page-1;

        Pageable pageableRequest = PageRequest.of(page, limit);
        Page<User> usersPage = userRepository.findAll(pageableRequest);
        List<User> users = usersPage.getContent();

        for (User user : users){
            userProto userRestProto = userProto.newBuilder()
                    .setUserId(user.getIdUser())
                    .setFirstName(user.getFirstName())
                    .setLastName(user.getLastName())
                    .setEmail(user.getEmail())
                    .build();
            userRestProtoList.add(userRestProto);
        }
        UserRestProtoColl userRestProtoColl = UserRestProtoColl.newBuilder()
                .addAllUserRestProtos(userRestProtoList)
                .build();
        responseObserver.onNext(userRestProtoColl);
        responseObserver.onCompleted();

    }
}