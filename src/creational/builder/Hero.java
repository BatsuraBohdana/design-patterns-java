package creational.builder;

public class Hero {
    private String name;
    private String heroClass;
    private String weapon;
    private String armor;
    private String mount;

    private Hero(HeroBuilder builder) {
        this.name = builder.name;
        this.heroClass = builder.heroClass;
        this.weapon = builder.weapon;
        this.armor = builder.armor;
        this.mount = builder.mount;
    }

    public void showStats() {
        System.out.println("   Герой: " + name + " | Клас: " + heroClass);
        System.out.println("   Зброя: " + (weapon != null ? weapon : "Голі кулаки"));
        System.out.println("   Броня: " + (armor != null ? armor : "Відсутня"));
        System.out.println("   Маунт: " + (mount != null ? mount : "Пішки"));
    }

    public static class HeroBuilder {
        private String name;
        private String heroClass;
        private String weapon;
        private String armor;
        private String mount;

        public HeroBuilder(String name, String heroClass) {
            this.name = name;
            this.heroClass = heroClass;
        }

        public HeroBuilder withWeapon(String weapon) {
            this.weapon = weapon;
            return this;
        }

        public HeroBuilder withArmor(String armor) {
            this.armor = armor;
            return this;
        }

        public HeroBuilder withMount(String mount) {
            this.mount = mount;
            return this;
        }

        public Hero build() {
            return new Hero(this);
        }
    }
}