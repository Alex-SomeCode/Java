package hw_4_2019;

public class User {
    // 1. Створити клас "Користувач"
    //        поля
    //        ПІБ, вік, пошта,ід,телефон
    //        За допомоги внутрішнього класу реалізувати паттерн "Builder"

    private String fullName;
    private byte age;
    private String mail;
    private String phone;

    public static UserBuilder builder(){
        return new UserBuilder();
    }

    @Override
    public String toString() {
        return "User{" +
                "fullName='" + fullName + '\'' +
                ", age=" + age +
                ", mail='" + mail + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }

    public static class UserBuilder {
        private User user = new User();

        public UserBuilder setFullName(String fullName) {
            user.fullName = fullName;
            return this;
        }

        public UserBuilder setAge(byte age) {
            user.age = age;
            return this;
        }

        public UserBuilder setMail(String mail) {
            user.mail = mail;
            return this;
        }

        public UserBuilder setPhone(String phone){
            user.phone = phone;
            return this;
        }

        public User buildUser (){
            return this.user;
        }


    }

}
