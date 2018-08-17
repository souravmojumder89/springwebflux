import org.junit.Test;
import reactor.core.publisher.Mono;


public class MonoTest {
    @Test
    public void monoTest(){
    System.out.println("**************");
        Mono.just("A")
                .log()
                .subscribe(System.out::println);
    }
    @Test
    public void monoTest2(){
        Mono.empty()
                .subscribe(System.out::println,null,()->System.out.println("Done"));

    }
    @Test
    public void monoTest3(){
        Mono.just("1")
                .subscribe(e->System.out.println(Integer.parseInt(e)),err->err.printStackTrace(),()->System.out.println("Done"));

    }

    /*@Test
    public void monoTest4(){
        Mono.just("A")
                .subscribe(e->System.out.println(Integer.parseInt(e)),err->System.out.println(err),()->System.out.println("Done"));

    }*/
}
