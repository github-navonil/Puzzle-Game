import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class Fourqueen extends JFrame
{
	JButton one,two,three,four,five,six,seven,eight,nine,ten,eleven,twelve,thirteen,fourteen,fifteen,sixteen;
	Boolean b=false;
	JLabel j1;
	JLabel background;
	int c;
	int count=1;
	String orig[]={"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15",""};
	String arr[]={"13","3","12","1","15","14","2","","9","7","5","10","4","8","6","11"};	
	public Fourqueen()
	{
		count=0;
		setLayout(new BorderLayout());
	    setContentPane(new JLabel(new ImageIcon("C:/Users/Navonil/Desktop/jelly.jpg")));
		j1=new JLabel("letz play");
		j1.setFont(new Font("Serif", Font.BOLD, 28));
        j1.setBounds(105, 180, 100,100);
        setResizable(false);
		one=new JButton(arr[count++]);
		one.setBackground(Color.cyan);
	    one.setForeground(Color.BLACK);
		two=new JButton(arr[count++]);
		two.setBackground(Color.cyan);
	    two.setForeground(Color.BLACK);
		three=new JButton(arr[count++]);
		three.setBackground(Color.cyan);
	    three.setForeground(Color.BLACK);
		four=new JButton(arr[count++]);
		four.setBackground(Color.cyan);
	    four.setForeground(Color.BLACK);
		five=new JButton(arr[count++]);
		five.setBackground(Color.cyan);
	    five.setForeground(Color.BLACK);
		six=new JButton(arr[count++]);
		six.setBackground(Color.cyan);
	    six.setForeground(Color.BLACK);
		seven=new JButton(arr[count++]);
		seven.setBackground(Color.cyan);
	    seven.setForeground(Color.BLACK);
		eight=new JButton(arr[count++]);
		eight.setBackground(Color.cyan);
	    eight.setForeground(Color.BLACK);
		nine=new JButton(arr[count++]);
		nine.setBackground(Color.cyan);
	    nine.setForeground(Color.BLACK);
		ten=new JButton(arr[count++]);
		ten.setBackground(Color.cyan);
	    ten.setForeground(Color.BLACK);
		eleven=new JButton(arr[count++]);
		eleven.setBackground(Color.cyan);
	    eleven.setForeground(Color.BLACK);
		twelve=new JButton(arr[count++]);
		twelve.setBackground(Color.cyan);
	    twelve.setForeground(Color.BLACK);
		thirteen=new JButton(arr[count++]);
		thirteen.setBackground(Color.cyan);
	    thirteen.setForeground(Color.BLACK);
		fourteen =new JButton(arr[count++]);
		fourteen.setBackground(Color.cyan);
	    fourteen.setForeground(Color.BLACK);
		fifteen=new JButton(arr[count++]);
		fifteen.setBackground(Color.cyan);
	    fifteen.setForeground(Color.BLACK);
		sixteen =new JButton(arr[count++]);
		sixteen.setBackground(Color.cyan);
	    sixteen.setForeground(Color.BLACK);
		
		
		one.setBounds(50, 10, 50, 50);
		two.setBounds(100, 10, 50,50);
		three.setBounds(150, 10, 50, 50);
		four.setBounds(200, 10, 50, 50);
		five.setBounds(50, 60, 50, 50);
		six.setBounds(100, 60, 50, 50);
		seven.setBounds(150, 60, 50, 50);
		eight.setBounds(200, 60, 50, 50);
		nine.setBounds(50, 110, 50, 50);
		ten.setBounds(100, 110, 50, 50);
		eleven.setBounds(150, 110, 50, 50);
		twelve.setBounds(200, 110, 50, 50);
		thirteen.setBounds(50, 160, 50, 50);
		fourteen.setBounds(100, 160, 50, 50);
		fifteen.setBounds(150, 160, 50, 50);
		sixteen.setBounds(200, 160, 50, 50);
		setBounds(50, 50, 300, 300);
		setLayout(null);
		setVisible(true);
		add(one);
		add(two);
		add(three);
		add(four);
		add(five);
		add(six);
		add(seven);
		add(eight);
		add(nine);
		add(ten);
		add(eleven);
		add(twelve);
		add(thirteen);
		add(fourteen);
		add(fifteen);
		add(sixteen);
		add(j1);
		
		one.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				calc(1);
				if((c=check())==1)
				{
					j1.setText("Game complete");
				}
				
			}
		});
		two.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				calc(2);
				if((c=check())==1)
				{
					j1.setText("Game complete");
				}
			}
		});
		three.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				calc(3);
				if((c=check())==1)
				{
					j1.setText("Game complete");
				}
			}
		});
		four.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				calc(4);
				if((c=check())==1)
				{
					j1.setText("Game complete");
				}
			}
		});

		five.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				calc(5);
				if((c=check())==1)
				{
					j1.setText("Game complete");
				}
			}
		});
		six.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				calc(6);
				if((c=check())==1)
				{
					j1.setText("Game complete");
				}
			}
		});
		seven.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				calc(7);
				if((c=check())==1)
				{
					j1.setText("Game complete");
				}
			}
		});
		eight.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				calc(8);
				if((c=check())==1)
				{
					j1.setText("Game complete");
				}
				
			}
		});
		nine.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				calc(9);
				if((c=check())==1)
				{
					j1.setText("Game complete");
				}
			}
		});
		ten.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				calc(10);
				if((c=check())==1)
				{
					j1.setText("Game complete");
				}
			}
		});
		eleven.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				calc(11);
				if((c=check())==1)
				{
					System.out.println("gfsf");
					j1.setText("Game complete");
				}
			}
		});
		twelve.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				calc(12);
				if((c=check())==1)
				{
					System.out.println("gfsf");
					j1.setText("Game complete");
				}
			}
		});
		thirteen.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				calc(13);
				if((c=check())==1)
				{
					j1.setText("Game complete");
				}
				
			}
		});
		fourteen.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				calc(14);
				if((c=check())==1)
				{
					j1.setText("Game complete");
				}
			}
		});
		fifteen.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				calc(15);
				if((c=check())==1)
				{
					j1.setText("Game complete");
				}
			}
		});
		sixteen.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				calc(16);
				if((c=check())==1)
				{
					j1.setText("Game complete");
				}
			}
		});
		
	}
	public int check()
	{
		Boolean b=true;
		for(int i=0;i<16;i++)
		{
			if(arr[i]!=orig[i])
			{
				b=false;
			}
		}
		if(b==true)
		{
			return 1;
		}
		else
		{
			return 0;
		}
		
	}
	
	public int calc(int a)
	{
		String temp;
		switch(a)
		{
		case 1:
			if(arr[1]=="")
			{
				temp=arr[1];
				arr[1]=arr[0];
				arr[0]=temp;
				rebuild();
			}
			else if(arr[4]=="")
			{
				temp=arr[4];
				arr[4]=arr[0];
				arr[0]=temp;
				rebuild();
			}
			break;
		case 2:
			if(arr[0]=="")
			{
				temp=arr[0];
				arr[0]=arr[1];
				arr[1]=temp;
				rebuild();
			}
			else if(arr[5]=="")
			{
				temp=arr[5];
				arr[5]=arr[1];
				arr[1]=temp;
				rebuild();
			}
			else if(arr[2]=="")
			{
				temp=arr[2];
				arr[2]=arr[1];
				arr[1]=temp;
				rebuild();
			}
			break;
		case 3:
			if(arr[1]=="")
			{
				temp=arr[1];
				arr[1]=arr[2];
				arr[2]=temp;
				rebuild();
			}
			else if(arr[6]=="")
			{
				temp=arr[6];
				arr[6]=arr[2];
				arr[2]=temp;
				rebuild();
			}
			else if(arr[3]=="")
			{
				temp=arr[3];
				arr[3]=arr[2];
				arr[2]=temp;
				rebuild();
			}
			break;
		case 4:
			if(arr[2]=="")
			{
				temp=arr[2];
				arr[2]=arr[3];
				arr[3]=temp;
				rebuild();
			}
			else if(arr[7]=="")
			{
				temp=arr[7];
				arr[7]=arr[3];
				arr[3]=temp;
				rebuild();
			}
			break;
		case 5:
			if(arr[0]=="")
			{
				temp=arr[0];
				arr[0]=arr[4];
				arr[4]=temp;
				rebuild();
			}
			else if(arr[5]=="")
			{
				temp=arr[5];
				arr[5]=arr[4];
				arr[4]=temp;
				rebuild();
			}
			else if(arr[8]=="")
			{
				temp=arr[8];
				arr[8]=arr[4];
				arr[4]=temp;
				rebuild();
			}
			break;
		case 6:
			if(arr[4]=="")
			{
				temp=arr[4];
				arr[4]=arr[5];
				arr[5]=temp;
				rebuild();
			}
			else if(arr[9]=="")
			{
				temp=arr[9];
				arr[9]=arr[5];
				arr[5]=temp;
				rebuild();
			}
			else if(arr[6]=="")
			{
				temp=arr[6];
				arr[6]=arr[5];
				arr[5]=temp;
				rebuild();
			}
			else if(arr[1]=="")
			{
				temp=arr[1];
				arr[1]=arr[5];
				arr[5]=temp;
				rebuild();
			}
			break;
		case 7:
			if(arr[5]=="")
			{
				temp=arr[5];
				arr[5]=arr[6];
				arr[6]=temp;
				rebuild();
			}
			else if(arr[10]=="")
			{
				temp=arr[10];
				arr[10]=arr[6];
				arr[6]=temp;
				rebuild();
			}
			else if(arr[7]=="")
			{
				temp=arr[7];
				arr[7]=arr[6];
				arr[6]=temp;
				rebuild();
			}
			else if(arr[2]=="")
			{
				temp=arr[2];
				arr[2]=arr[6];
				arr[6]=temp;
				rebuild();
			}
			break;
		case 8:
			if(arr[3]=="")
			{
				temp=arr[3];
				arr[3]=arr[7];
				arr[7]=temp;
				rebuild();
			}
			else if(arr[6]=="")
			{
				temp=arr[6];
				arr[6]=arr[7];
				arr[7]=temp;
				rebuild();
			}
			else if(arr[11]=="")
			{
				temp=arr[11];
				arr[11]=arr[7];
				arr[7]=temp;
				rebuild();
			}
			break;
		case 9:
			if(arr[4]=="")
			{
				temp=arr[4];
				arr[4]=arr[8];
				arr[8]=temp;
				rebuild();
			}
			else if(arr[9]=="")
			{
				temp=arr[9];
				arr[9]=arr[8];
				arr[8]=temp;
				rebuild();
			}
			else if(arr[12]=="")
			{
				temp=arr[12];
				arr[12]=arr[8];
				arr[8]=temp;
				rebuild();
			}
			break;
		case 10:
			if(arr[8]=="")
			{
				temp=arr[8];
				arr[8]=arr[9];
				arr[9]=temp;
				rebuild();
			}
			else if(arr[13]=="")
			{
				temp=arr[13];
				arr[13]=arr[9];
				arr[9]=temp;
				rebuild();
			}
			else if(arr[10]=="")
			{
				temp=arr[10];
				arr[10]=arr[9];
				arr[9]=temp;
				rebuild();
			}
			else if(arr[5]=="")
			{
				temp=arr[5];
				arr[5]=arr[9];
				arr[9]=temp;
				rebuild();
			}
			break;
		case 11:
			if(arr[9]=="")
			{
				temp=arr[9];
				arr[9]=arr[10];
				arr[10]=temp;
				rebuild();
			}
			else if(arr[14]=="")
			{
				temp=arr[14];
				arr[14]=arr[10];
				arr[10]=temp;
				rebuild();
			}
			else if(arr[11]=="")
			{
				temp=arr[11];
				arr[11]=arr[10];
				arr[10]=temp;
				rebuild();
			}
			else if(arr[6]=="")
			{
				temp=arr[6];
				arr[6]=arr[10];
				arr[10]=temp;
				rebuild();
			}
			break;
		case 12:
			if(arr[7]=="")
			{
				temp=arr[7];
				arr[7]=arr[11];
				arr[11]=temp;
				rebuild();
			}
			else if(arr[10]=="")
			{
				temp=arr[10];
				arr[10]=arr[11];
				arr[11]=temp;
				rebuild();
			}
			else if(arr[15]=="")
			{
				temp=arr[15];
				arr[15]=arr[11];
				arr[11]=temp;
				rebuild();
			}
			break;
		case 13:
			if(arr[13]=="")
			{
				temp=arr[13];
				arr[13]=arr[12];
				arr[12]=temp;
				rebuild();
			}
			else if(arr[8]=="")
			{
				temp=arr[8];
				arr[8]=arr[12];
				arr[12]=temp;
				rebuild();
			}
			break;
		case 14:
			if(arr[14]=="")
				{
					temp=arr[14];
					arr[14]=arr[13];
					arr[13]=temp;
					rebuild();
				}
				else if(arr[9]=="")
				{
					temp=arr[9];
					arr[9]=arr[13];
					arr[13]=temp;
					rebuild();
				}
				else if(arr[12]=="")
				{
					temp=arr[12];
					arr[12]=arr[13];
					arr[13]=temp;
					rebuild();
				}
			break;
		case 15:
			if(arr[15]=="")
			{
				temp=arr[15];
				arr[15]=arr[14];
				arr[14]=temp;
				rebuild();
			}
			else if(arr[13]=="")
			{
				temp=arr[13];
				arr[13]=arr[14];
				arr[14]=temp;
				rebuild();
			}
			else if(arr[10]=="")
			{
				temp=arr[10];
				arr[10]=arr[14];
				arr[14]=temp;
				rebuild();
			}
			break;
		case 16:
			if(arr[14]=="")
			{
				temp=arr[15];
				arr[15]=arr[14];
				arr[14]=temp;
				rebuild();
			}
			else if(arr[11]=="")
			{
				temp=arr[11];
				arr[11]=arr[15];
				arr[15]=temp;
				rebuild();
			}
			break;
		}
		
		return 0;
}
	public void rebuild()
	{
		
		count=0;
		one.setText(arr[count++]);
		two.setText(arr[count++]);
		three.setText(arr[count++]);
		four.setText(arr[count++]);
		five.setText(arr[count++]);
		six.setText(arr[count++]);
		seven.setText(arr[count++]);
		eight.setText(arr[count++]);
		nine.setText(arr[count++]);
		ten.setText(arr[count++]);
		eleven.setText(arr[count++]);
		twelve.setText(arr[count++]);
		thirteen.setText(arr[count++]);
		fourteen.setText(arr[count++]);
		fifteen.setText(arr[count++]);
		sixteen.setText(arr[count++]);
		
	}
	public static void main(String[] args) 
	{
		new Fourqueen();
	}
}
