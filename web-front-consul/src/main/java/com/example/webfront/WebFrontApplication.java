package com.example.webfront;

import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@SpringBootApplication
@RestController
@EnableDiscoveryClient
public class WebFrontApplication {

    private final RestTemplate restTemplate;
    private final LoadBalancerClient loadBalancerClient;


    public WebFrontApplication(RestTemplateBuilder builder, LoadBalancerClient loadBalancerClient) {
        this.restTemplate = builder.build();
        this.loadBalancerClient = loadBalancerClient;
    }

    public String getUrl() {
        return this.loadBalancerClient.choose("web-backend").getUri().toString();
    }

    @RequestMapping("/")
    public String hi() {
        return "hi";
    }

    @RequestMapping("/greetings")
    public String hello() {

        String url = getUrl();

        System.out.println(url);

        String result = this.restTemplate.getForObject(url, String.class);

        String java_ver = System.getProperty("java.vm.version");


        return  "MMMMMMMMMMMBTMMMM#TMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\n"+
                "MMMMMMMMMM!  .MMMM#   ?WMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\n"+
                "MMMMMMM      .MMMM#    .MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\n"+
                "MM9^       ..MMMMM#    .MM@  7HMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMHMHMMMMMMMMMMMMWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\n"+
                "M       .+MMMMMMMM#    .MM@    (MMMMMM   JMMMMM#   dMMMMMMMMMMMMMMMMMMMMMMMM   JMMMMMMMMM}  (MMMMM        MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\n"+
                "M    .MMMM#M .MMMM#    .MM@    (MMMMMM   JMMMMM#   dMMMMMMMMMMMMMMMMMMMMMMMM   JMMMMMMMMMMMM(MM!         (MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\n"+
                "M    .MMM    .MMMM#    -MM@    (MMMMMM   JMMMMM#   dMMMMMMMMMWMMMM#MMMMMMTMM   J#MM77TMMMYMM4M#   MMMMMMMMMMMMM777MWMMMMMMTM#MM#MMWHMM77TMMM\n"+
                "M    .MMM    .MMMM=    .MM@    (MMMMMM   ?MMMMM@   dMN         MMF   .....MM          .MM}  (M@   MMMMMMMMM$   ...   4M#      d#     ..   WM\n"+
                "M    .MMM              .MM@    (MMMMMM             dMMMMMMMM   dM)  (MMMMMMM   .NMMb   MM}  (M@   MMMMMMMM#   MMMMb  .M#   .JMM#   MMMM]  .M\n"+
                "M    .MMM    .....,    -MM@    (MMMMMM   (NNNNNm   dMM#        dMb.    _7WMM   JMMM@   MM}  (M@   MMMMMMMM#   MMMM@   M#   MMMM#   MMMM]  .M\n"+
                "M    .MMM    .MMMM#    .MM@    (MMMMMM   JMMMMM#   dMF  ....   dMMMNNg,   MM   JMMM@   MM}  (M@   MMMMMMMM#   MMMMF   M#   MMMM#   MMMM]  .M\n"+
                "M    .MMM    .MMMM# ..MMMMF    (MMMMMM   JMMMMM#   dM)  JMM#   dM#WMMM#   MM   JMMM@   MM}  (MN.         4N   ?MM#^  .M#   MMMM#   WMM#'  .M\n"+
                "M    .MMM    .MMMMNMMMMMM      (MMMMMM   JMMMMM#   dMN         dM{       .MM   JMMM@   MM}  (MMN,        ,MN,       .MM#   MMMM#         .MM\n"+
                "MNa. .MMM    .MMMMM#M        .gMMMMMMMMMMMMMMMMMMMMMMMMMNMMMMMMMMMMMMNMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMNNMMMMMMMMMNNMMMMMMMMMMMMMM#   MMNNMMMMM\n"+
                "MMMMMNMMM    .MMMM#      ..MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM#   MMMMMMMMM\n"+
                "MMMMMMMMMJ,  .MMMM#   .JMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM# ..MMMMMMMMM\n"+
                "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\n"
                + "\r\n"
                + "Message from Backend = " + result
                + "\r\n"
                + "Current java version = " + java_ver
                + "\r\n"
                + "App index = " + "1"
                + "\r\n"
                + "Backend host = " + "localhost";
    }


    public static void main(String[] args) {
        SpringApplication.run(WebFrontApplication.class, args);
    }
}

