package singleton;

import javax.management.InstanceAlreadyExistsException;

public class enumSigleton {
    public enum Singleton {
        INSTANCE;

        private String data;

        public void Singleton() {
            data = "Hello";
        }

        public String getData() {
            return data;
        }

        public void setData(String newData) {
            this.data = newData;
        }
    }


}
