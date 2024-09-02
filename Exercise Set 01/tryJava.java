public class tryJava {
    String reuse_data = "reuse me";
    public void tryJavaMethod()
    {
        System.out.println(reuse_data);
    }
}
class tryInheritance extends tryJava
{
public void setReuse()
{
reuse_data = "from inherited";
}
public void printReuse()
{
    System.out.println(reuse_data);
}

}





//pero gets kona, gawa ka ng instance ng frontInterface, nasa pinakababa to ng class tryGUI->backInterface->front?
//yun nga, gets?
//