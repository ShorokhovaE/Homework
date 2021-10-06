package lesson5;

public class lesson5 {
    public static void main( String [] args) {
        Employee[] persArray = new Employee[5];

        persArray[0] = new Employee("Болгина Елена Романовна", "Специалист", "bolgina@mail.ru", "89278008566", 40000, 26);
        persArray[1] = new Employee("Адамович Татьяна Владимировна", "Технолог", "tvadam@yandex.ru", "84956667878", 50500, 35);
        persArray[2] = new Employee("Акопян Арсений Владимирович", "Инженер", "akopjan@gmail.com", "89005676565", 67700, 56);
        persArray[3] = new Employee("Алешин Сергей Сергеевич", "Разработчик", "aleshin@iitp.ru", "89006809098", 70600, 29);
        persArray[4] = new Employee("Гонцов Ренат Равилевич", "Научный сотрудник", "gontsovrr@gmail.com", "88006505454", 46000, 45);

        for (int i = 0; i < persArray.length; i++) {
            if(persArray[i].getAge() > 40){
                persArray[i].info();
            }
        }
    }

}
