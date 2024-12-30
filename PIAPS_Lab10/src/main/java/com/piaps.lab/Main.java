package com.piaps.lab;

import com.piaps.lab.entity.Faculty;
import com.piaps.lab.entity.Institute;
import com.piaps.lab.entity.ResearchAssociate;

public class Main {

    public static void main(String[] args) {
        Faculty fkn = new Faculty("ФКН");

        Institute is = new Institute("ИС", "387");
        Institute itu = new Institute("ИТУ", "312п");
        Institute piit = new Institute("ПиИТ", "380");

        fkn.setInstitutes(new Institute[]{is, itu, piit});
        ResearchAssociate emp1 = new ResearchAssociate(1234, "Сирота Александр Анатольевич",
                "Защита информации");
        ResearchAssociate emp2 = new ResearchAssociate(1234, "Акимов Алексей Викторович",
                "Технологии обработки информации");

        piit.setEmployees(new ResearchAssociate[]{emp1, emp2});
        Institute[] fkn_institutes = fkn.getInstitutes();

        System.out.println("Кафедры на факультете " + fkn.getName() + ": \n");
        for (int i = 0; i < fkn_institutes.length; i++) {
            System.out.println(fkn_institutes[i].getName());
        }

        ResearchAssociate[] piitEmployees = piit.getEmployees();

        System.out.println("Сотрудники кафедры " + piit.getName() + ": \n");
        for (int i = 0; i < piitEmployees.length; i++) {
            System.out.println(piitEmployees[i].getName());
        }
    }
}
