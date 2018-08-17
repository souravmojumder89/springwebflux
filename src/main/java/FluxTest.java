import org.junit.Test;
import reactor.core.publisher.Flux;

public class FluxTest {

    @Test
    public void testFlux(){
        Flux.just("A","B","C","D","E")
                .log()
                .subscribe(System.out::println,null,()->System.out.println("All Completed"));
    }
}
