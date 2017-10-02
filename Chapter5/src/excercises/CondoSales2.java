package excercises;import javax.swing.JOptionPane;public class CondoSales2{
/*Variables*/public static void main(String[] args){int choice,condoP=0,garageP=0,totalP;
/*Choices*/choice=Integer.parseInt(JOptionPane.showInputDialog(null,"Would you like a condo with : "
/*Choices*/+"\n1. Park View - $150,000\n2. Golf Course View - $170,000\n3. Lake View - $210,000\n\nPlease input the number."));		
/*Choices*/if(choice==1){condoP=150000;}else if(choice==2){condoP=170000;}else if(choice==3){condoP=210000;} 
/*Garage*/if(condoP!=0){choice=Integer.parseInt(JOptionPane.showInputDialog(null,"Would you like a parking space or a garage?\n1. Parking Space\n2. Garage - $5,000"));
/*Garage*/if(choice==2){garageP=5000;}}
/*Final*/totalP=condoP+garageP;JOptionPane.showMessageDialog(null,"Your price is "+condoP+" + "+garageP+"\n Total : "+totalP);}}