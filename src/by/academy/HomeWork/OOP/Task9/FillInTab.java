package by.academy.HomeWork.OOP.Task9;

public class FillInTab {
    //                                  private        default       protected        public

    // один и тот же класс                yes             yes           yes            yes
    //   SuperClass

    // Подкласс, находящийся
    // в том же пакете,что и              no              yes           yes             yes
    // суперкласс
    // SuperClass1 extends SuperClass

    // Класс из того же самого
    // пакета не являющийся               no              yes           yes             yes
    // подклассом
    // SimpleClass

    // Подкласс находящийся в
    // другом пакете                       no              no           yes             yes
    // SuperClass2

    //Класс из другого пакета,
    // не являющийся подклассом             no             no            no             yes
    // данного.
    // SimpleClass2
}
