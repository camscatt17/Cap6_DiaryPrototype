/**
 * Realiza testes da classe Day que envolvem
 * o agendamento de compromissos de duas hora.
 * 
 * @author Camila Santos 
 * @version 07.05.2020
 */
public class TwoHourTests
{
    // O objeto Day sendo testado
    private Day day;

    /**
     * Construtor para objetos da classe OneHourTests
     */
    public TwoHourTests()
    {
    }

    /**
     * Testa a funcionalidade básica reservando no inicio,
     * no meio, no final de um dia e em um horario conflituoso.
     *
     * @return     void
     */
    public void makeThreeAppointments()
    {
        //Inicia com um objeto Day recente
        day = new Day(1);
        
        Appointment first = new Appointment("Java lecture", 2);
        Appointment second = new Appointment("Java class", 2);
        Appointment third = new Appointment("Meet Leo", 2);
        
        //Agendamento do horário conflituoso
        Appointment conflituoso = new Appointment("conflito",2);
        
        //Agenda cada compromisso em uma hora diferente.
        day.makeAppointment(9, first);
        day.makeAppointment(13, second);
        day.makeAppointment(17, third);
        
        //Tenta marcar o compromisso de 2 horas em um espaço pra um compromisso de 1 hora
        day.makeAppointment(12, conflituoso);
        
        //Mostra se os compromissos foram realmente marcados
        day.showAppointments();
    }
    
    /**
     * Verifica se a reserva dupla não é permitida
     */
     
    public void testDoubleBooking(){
         
         //configura o dia com três compromissos legítimos
         makeThreeAppointments();
         Appointment badAppointment = new Appointment("error", 2);
         
         //agenda o compromisso no mesmo horario de um compromisso já agendado
         day.makeAppointment (9, badAppointment);
         
         //mostra que o badAppointment nao foi realizado
         day.showAppointments();
        }
        
        /**
         * Testa a funcionalidade básica preenchendo um 
         * dia inteiro com compromissos.
         */
         
        public void fillDay(){
            //inicia com um objeto Day recente.
            day = new Day(1);
            
            for(int time = Day.START_OF_DAY; time <= Day. FINAL_APPOINTMENT_TIME; time+=2){
                day.makeAppointment(time, new Appointment("test"+time, 2));
            }
            
            day.showAppointments();
        }
        
        /**
         * Testa a funcionalidade de não impedir o agendamento
         * de compromissos fora dos limites do vetor.
         */
        
        public void outOfBounds(){
            //Inicia com um objeto Day recente
            day = new Day(1);
            
            Appointment error = new Appointment("error", 2);
            Appointment error2 = new Appointment("error", 2);
            
            //Tenta agendar fora dos limites do vetor
            day.makeAppointment(8, error);
            day.makeAppointment(18, error);
            
            //Mostra que os agendamentos nao foram feitos
            day.showAppointments();     
            
        }
      
    }
