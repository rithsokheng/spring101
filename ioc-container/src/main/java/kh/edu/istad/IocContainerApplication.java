package kh.edu.istad;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class IocContainerApplication implements CommandLineRunner {

    // 1. Declare dependency
    private final MyBean myBean; // Required dependency
    private MyBean myBean2; // Optional dependency

    // 2. Constructor injection
    public IocContainerApplication(MyBean myBean) {
        this.myBean = myBean;
    }

    // 3. Setter injection
    @Autowired
    public void setMyBean2(MyBean myBean2) {
        this.myBean2 = myBean2;
    }

    @Override
    public void run(String... args) throws Exception {
        myBean.getName("John");
        myBean2.getName("Kanha");
        IO.println("My bean: " + myBean);
        IO.println("My bean: " + myBean2);
    }

    public static void main(String[] args) {
        SpringApplication.run(IocContainerApplication.class, args);
    }


}