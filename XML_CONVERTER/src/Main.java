import CampData.CampData;
import ItemEquipment.ItemData;
import ItemOption.ItemOption;
import Mail.MailData;
import WeekDungeonData.WeekDungeonData;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.*;
import java.util.List;


public class Main {

    public static void main(String[] args) throws IOException {
        //System.out.println("Hello World!");


        try {
            File file = new File("c:/xml/CampData.xml");

            JAXBContext jaxbContext = JAXBContext.newInstance(CampData.class);
            Unmarshaller jaxbunUnmarshaller = jaxbContext.createUnmarshaller();


            CampData fileObject = (CampData) jaxbunUnmarshaller.unmarshal(file);

           // System.out.println(heroes.getHero().toString());
            List<CampData.CampGradeList.CampGrade> data = fileObject.getCampGradeList().getCampGrade();

            for(CampData.CampGradeList.CampGrade temp : data)
            {
                //System.out.println(temp.getTemplateId() + " | " + temp.getId() +  " | "  + temp.devName + " | " );
                System.out.println(temp.getTemplateId() + " | " + temp.getDevName());

            }

        } catch (JAXBException e) {
            e.printStackTrace();
        }


    }
  
}
