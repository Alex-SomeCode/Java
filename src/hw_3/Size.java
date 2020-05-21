package hw_3;

// 1. Створити енум, який містить розміри одягу (XXS, XS, S, M, L).
// Написати в ньому абстрактий метод getDescription.
// Оверрайднути метод getDescription для всіх об'єктів енума, який повертатиме стрічку - опис розміра (просто якийсь текст).
// Додати в енум в поле int euroSize, написати конструктор, який параметром буде приймати значення для поля.
public enum Size {

    XXS(38) {
        @Override
        public String getDescription() {
            return "eXtra eXtra small - найменший розмір";
        }
    },

    XS(40) {
        @Override
        public String getDescription() {
            return "eXtra small - дуже маленький розмір";
        }
    },
    S(42) {
        @Override
        public String getDescription() {
            return "small – маленький розмір";
        }
    },
    M(44) {
        @Override
        public String getDescription() {
            return "medium – середній розмір";

        }

    },
    L(46) {
        @Override
        public String getDescription() {
            return "large – великий розмір";
        }
    };

    private int euroSize;

    Size(int euroSize) {
        this.euroSize = euroSize;
    }

    public abstract String getDescription();

    public int getEuroSize() {
        return euroSize;
    }

    public void setEuroSize(int euroSize) {
        this.euroSize = euroSize;
    }
}
