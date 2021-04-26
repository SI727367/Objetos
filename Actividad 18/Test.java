public class Test {
    HelloWorld saludoEspañol = new HelloWorld() {
        @Override
        public void greet() {
            System.out.println("Hola Mundo!");
        }

        @Override
        public void greetSomeone(String someone) {
            System.out.println("Hola " + someone + "!");
        }
    };

    HelloWorld greetingEnglish = new HelloWorld(){
        @Override
        public void greet() {
            System.out.println("Hello World!");
        }

        @Override
        public void greetSomeone(String someone) {
            System.out.println("Hello " + someone + "!");
        }
    };

    HelloWorld salutationFrancais = new HelloWorld(){
        @Override
        public void greet() {
            System.out.println("Bonjour le monde");
        }

        @Override
        public void greetSomeone(String someone) {
            System.out.println("Bonjour " + someone + "!");
        }
    };

    Person student = new Person(){
        @Override
        public void work() {
            System.out.println("El estudiante está en clase");
        }
    };

    Person professor = new Person(){
        @Override
        public void work() {
            System.out.println("El profesor está impartiendo cátedra");
        }
    };
}
