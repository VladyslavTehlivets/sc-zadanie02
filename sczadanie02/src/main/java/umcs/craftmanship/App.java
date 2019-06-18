package umcs.craftmanship;

public class App 
{
    public static void main( String[] args )
    {
        LombokBuilder lombokBuilder = LombokBuilder.builder()
                .groupId("org.projectlombok")
                .artifactId("lombok")
                .version("1.18.6")
                .build();
    }
}
