package unicred.com.br.testemapping;

public class TesteDTOParser {

    abstract static class Result {
        abstract DomainObjectA resultAsDomainA();
        abstract DomainObjectB resultAsDomainB();
    }

    static class DomainObjectA extends TesteDTOParser {
        private String name;
        private String age;

        public DomainObjectA(String name, String age) {
            this.name = name;
            this.age = age;
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

    }

    static class DomainObjectB extends TesteDTOParser{
        private String name;
        private String level;

        public DomainObjectB(String name, String level) {
            this.name = name;
            this.level = level;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getLevel() {
            return level;
        }

        public void setLevel(String level) {
            this.level = level;
        }

    }
}
