package unicred.com.br.testemapping;

public class TesteDTO implements Mappable<TesteDTOParser.Result> {

    private String name;
    private String age;
    private String level;

    public TesteDTO(String name, String age, String level) {
        this.name = name;
        this.age = age;
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    @Override
    public TesteDTOParser.Result map() {
        return new TesteDTOParser.Result() {
            @Override
            TesteDTOParser.DomainObjectA resultAsDomainA() {
                return new TesteDTOParser.DomainObjectA(getName(), getAge());
            }

            @Override
            TesteDTOParser.DomainObjectB resultAsDomainB() {
                return new TesteDTOParser.DomainObjectB(getName(), getLevel());
            }
        };
    }
}
