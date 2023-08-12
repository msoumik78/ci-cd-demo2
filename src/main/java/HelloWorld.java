import io.javalin.Javalin;

public class HelloWorld {
    public static void main(String[] args) {
        Javalin.create(/*config*/)
                .get("/", ctx -> ctx.result("Hello World"))
                .get("/hello/{name}", ctx -> ctx.result("Hello: " + ctx.pathParam("name")))
                .start(7070);
    }
}