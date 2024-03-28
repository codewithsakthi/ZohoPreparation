package Advanced_Coding.Railways;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        boolean flag = true;
        while (flag)
        {
            System.out.println("1.Book Ticket \n2.Cancel Ticket \n3.Display Available Tickets \n4.Print Booked Tickets \n5.Exit ");
            int choice = s.nextInt();
            switch (choice)
            {
                case 1:
                {
                    System.out.println("Enter your name,age,gender,prefered birth(L or M or U)");
                    String name = s.next();
                    int age =s.nextInt();
                    String gender = s.next();
                    String prefered = s.next();
                    Passengers p = new Passengers(name,age,gender,prefered);
                    bookTicket(p);
                }
                    break;
                case 2:
                {
                    System.out.println("Enter Id to Cancel");
                    int id = s.nextInt();
                    TicketBooker.cancel(id);

                }
                    break;
                case 3:
                    TicketBooker.displayAvailableTickets();
                    break;
                case 4:
                    TicketBooker.displayBookedTickets();
                    break;
                case 5:
                {
                    flag =false;
                }
                    break;
                default:
                    break;
            }
        }
    }
    public static void bookTicket(Passengers p){
        TicketBooker booker = new TicketBooker();
        if(TicketBooker.availableW == 0)
        {
            System.out.println("No Tickets Available");
        }
        if(
                p.birthPreference.equals("L") && TicketBooker.availableL>0 ||
                p.birthPreference.equals("M") && TicketBooker.availableM > 0 ||
                p.birthPreference.equals("U") && TicketBooker.availableU>0  )
        {
            if(p.birthPreference.equals("L")){
                System.out.println("Lower Birth Given");
                booker.bookTicket(p,booker.lPosition.get(0),"L");
                booker.lPosition.remove(0);
                TicketBooker.availableL--;
            }
            else if(p.birthPreference.equals("M")){
                System.out.println("Middle Birth Given");
                booker.bookTicket(p,booker.mPosition.get(0),"M");
                booker.mPosition.remove(0);
                TicketBooker.availableM--;
            }
            else if(p.birthPreference.equals("U")){
                System.out.println("Upper Birth Given");
                booker.bookTicket(p,booker.uPosition.get(0),"U");
                booker.uPosition.remove(0);
                TicketBooker.availableU--;
            }

        }
        else if(TicketBooker.availableL>0){
            System.out.println("Lower Birth Given");
            booker.bookTicket(p,booker.lPosition.get(0),"L");
            booker.lPosition.remove(0);
            TicketBooker.availableL--;
        }
        else if(TicketBooker.availableM > 0 ){
            System.out.println("Middle Birth Given");
            booker.bookTicket(p,booker.mPosition.get(0),"M");
            booker.mPosition.remove(0);
            TicketBooker.availableM--;
        }
        else if(     TicketBooker.availableU>0){
            System.out.println("Upper Birth Given");
            booker.bookTicket(p,booker.uPosition.get(0),"U");
            booker.uPosition.remove(0);
            TicketBooker.availableU--;
        }
        else if (TicketBooker.availableR> 0) {
            System.out.println("Rac available");
            booker.racBooking(p,booker.rPosition.get(0),"RAC");
        }
        else if (TicketBooker.availableW> 0) {
            System.out.println("WaitingList available");
            booker.wBooking(p,booker.wPosition.get(0),"W");
        }
    }
}