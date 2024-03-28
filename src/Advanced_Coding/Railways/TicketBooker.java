package Advanced_Coding.Railways;

import Advanced_Coding.Railways.Passengers;
import java.util.*;

public class TicketBooker {
    static int availableL  =0;
    static  int availableM =1;
    static int availableU  =1;
    static int availableR  =1;
    static int availableW  =1;

    static List<Integer> lPosition = new ArrayList<>(Arrays.asList(1));
    static List<Integer> uPosition = new ArrayList<>(Arrays.asList(1));
    static List<Integer> mPosition = new ArrayList<>(Arrays.asList(1));
    static List<Integer> rPosition = new ArrayList<>(Arrays.asList(1));
    static List<Integer> wPosition = new ArrayList<>(Arrays.asList(1));
    static List<Integer> bookedList = new ArrayList<>();
    static Map<Integer,Passengers> passengersMap = new HashMap<>();
    static Queue<Integer>  waitingList  = new LinkedList<>();
    static Queue<Integer>  racList = new LinkedList<>();


public static void bookTicket(Passengers p,int position,String alloted){
    p.position = position;
    p.alloted = alloted;
    bookedList.add(p.pId);
    passengersMap.put(p.pId,p);
}
public static void racBooking(Passengers p,int position,String alloted)
{
    p.position =position;
    p.alloted = alloted;
    availableR--;
    rPosition.removeFirst();
    racList.add(p.pId);
    passengersMap.put(p.pId,p);
    System.out.println("Added to RAC");
}
    public static void wBooking(Passengers p, int position, String alloted)
    {
        p.position =position;
        p.alloted = alloted;
        availableW--;
        waitingList.add(p.pId);
        wPosition.removeFirst();
        passengersMap.put(p.pId,p);
        System.out.println("Added to waiting List");
    }
public static void displayAvailableTickets(){
    System.out.println("Avilable L :"+availableL);
    System.out.println("Avilable M :"+availableM);
    System.out.println("Avilable U :"+availableU);
    System.out.println("Avilable RAC :"+availableR);
    System.out.println("Avilable Waiting List :"+availableW);

}
public static void displayBookedTickets(){
    if(passengersMap.size() == 0)
    {
        System.out.println("No details of passengers");
        return;
    }
    for (Passengers p : passengersMap.values()){
            System.out.println("Passenger Name :"+p.name);
            System.out.println("Passenger Age :"+p.age);
            System.out.println("Id  :"+p.pId);
            System.out.println("Alotted seat :"+p.alloted+p.position);
    }
}

public static void cancel(int id){
    System.out.println("Ticket Canceled Successfully");
    Passengers p =passengersMap.get(id);
    passengersMap.remove(id);
    bookedList.remove(id);
    int position =p.position;
    String alotted = p.alloted;
    if(alotted.equals("L")){
        availableL++;
        lPosition.add(position);
    } else if (alotted.equals("M"))
    {
        availableM++;
        mPosition.add(position);
    } else if (alotted.equals("U"))
    {
        availableU++;
        uPosition.add(position);
    }
    if(racList.size()>0) {
        int Racid = racList.poll();
        Passengers pfromrac = passengersMap.get(Racid);
        int racpos = pfromrac.position;
        racList.remove(Racid);
        availableR++;
        rPosition.add(racpos);
        if (waitingList.size() > 0) {
            int waitId = waitingList.poll();
            Passengers pfromwait = passengersMap.get(waitId);
            int wpos = pfromwait.position;
            waitingList.remove(waitId);
            availableW++;
            wPosition.add(wpos);
            pfromwait.position = rPosition.get(0);
            pfromwait.alloted = "W";
            rPosition.remove(0);
            racList.add(pfromwait.pId);
            availableR--;
            availableW++;
        }
        Main.bookTicket(pfromrac);
    }
}
}
