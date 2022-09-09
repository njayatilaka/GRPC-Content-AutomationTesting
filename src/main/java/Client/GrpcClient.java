package Client;

import ecommerce.services.pbc.content.api.ContentPbcApiServiceGrpc;
import ecommerce.services.pbc.content.api.ContentsPbc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class GrpcClient {

    public static void main(String[] args) {


//        ManagedChannel channel = ManagedChannelBuilder.forAddress("ecomm-content-pbc.dev.ashleyretail.com/api/content", 443).usePlaintext().build();
//        ManagedChannel channel = ManagedChannelBuilder.forAddress("ecomm-content-pbc.dev.ashleyretail.com/api/content", 443).usePlaintext().build();
        ManagedChannel channel = ManagedChannelBuilder.forTarget("ecomm-content-pbc.dev.ashleyretail.com:443").usePlaintext().build();

        ContentPbcApiServiceGrpc.ContentPbcApiServiceBlockingStub contentStub = ContentPbcApiServiceGrpc.newBlockingStub(channel);

        ContentsPbc.GetContentByFragmentRequest byFragmentRequest = ContentsPbc.GetContentByFragmentRequest.newBuilder().setComponentName("PageTemplate").setSlug("garrett").setStage("PUBLISHED").build();

        ContentsPbc.GetContentByFragmentResponse response = contentStub.getContentByFragment(byFragmentRequest);

        System.out.println("Response here: " +response);

    }
}