package lesson21;

public class Team {

    /**
     * Наименование команды
     */
    private String title;

    /**
     * Состав участников,которые умеют бегать и прыгать
     */
    private RunAndJumpable members [];

    public Team (String title, RunAndJumpable m1, RunAndJumpable m2, RunAndJumpable m3,
                 RunAndJumpable m4) {
        this.title = title;
        this.members = new RunAndJumpable[4];
        members[0] = m1;
        members[1] = m2;
        members[2] = m3;
        members[3] = m4;
    }

    /**
     * Выводит информацию о команде
     */
    public void teamInfo () {
        System.out.println(title);
        for (RunAndJumpable rj : members) {
            System.out.println(rj.toString());
        }
    }

    /**
     * Метод старта прохождения командой полосы препятствий.
     * Когда любой из членов команды не проходит юбое из препятсивий полосы, он
     * выбывает из гонки
     * @param course
     */
    public void goGoGo (Course course) {
        System.out.println("3!2!1!Старт!");
        for (RunAndJumpable member : members) {
            for (AbstractBarrier barrier : course.barriers) {
                boolean br = barrier.applyBarrier(member);
                if (! br) {
                    System.out.println(member.toString() + " не преодалел " + barrier.toString());
                    break;
                } else {
                    System.out.println(member.toString() + " преодалел " + barrier.toString());
                }
            }
        }
    }
}
