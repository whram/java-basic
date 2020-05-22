package annotation;

@MyAnno(age = 20, name = "Adam", per = Person.p1, anno2 = @MyAnno2)
@MyAnno3
public class Worker {

    public String name  = "Adam";

    @MyAnno3
    public void show() {

    }

}
