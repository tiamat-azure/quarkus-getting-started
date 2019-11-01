package nc.opt.quarkus;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class GreetingService {

    public String greeting(String name) {
        return "Great hello my friend " + name;
    }   
    
    public CompletionStage<String> greetingAsync(String name) {
        return CompletableFuture.supplyAsync(() -> "Great hello my friend " + name);
    }

}