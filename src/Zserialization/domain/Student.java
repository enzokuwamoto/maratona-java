package Zserialization.domain;

import java.io.Serializable;

public class Student implements Serializable {
    public Student(long l, String enzoKuwamoto, String number) {
    }

    public class Zserialization {
        private Long id;
        private String name;
        private transient String password;

        public Zserialization(Long id, String name, String password) {
            this.id = id;
            this.name = name;
            this.password = password;
        }

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }
    }

}
