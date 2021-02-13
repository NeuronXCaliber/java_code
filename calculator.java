import java.awt.*;
import java.awt.event.*;
import java. applet.*;
public class calculator extends Applet implements ActionListener
 {
  int v1,v2,result;
  TextField t1;
  Button b[]=new Button[10];
  Button add,sub,mul,div,clear,mod,EQ;
  char op,a;
  Panel p;
  public void init()
   {
    setLayout(new BorderLayout());
    p=new Panel();
    t1=new TextField(10);
    GridLayout gl=new GridLayout(4,5);
    p.setLayout(gl);
    add("North",t1);
    for(int i=0;i<10;i++)
     {
      b[i]=new Button(" "+i);
     }
    add=new Button("add");
    sub=new Button("sub");
    mul=new Button("mul");
    div=new Button("div");
    mod=new Button("mod");
    clear=new Button("clear");
    EQ=new Button("EQ");
    for(int i=0;i<10;i++)
     {
      p.add(b[i]);
     }
    p.add(add);
    p.add(sub);
    p.add(mul);
    p.add(div);
    p.add(mod);
    p.add(clear);
    p.add(EQ);
    add(p);
    for(int i=0;i<10;i++)
     {
      b[i].addActionListener(this);
     }
    add.addActionListener(this);
    sub.addActionListener(this);
    mul.addActionListener(this);
    div.addActionListener(this);
    mod.addActionListener(this);
    clear.addActionListener(this);
    EQ.addActionListener(this);
   } 
   public void actionPerformed(ActionEvent ae)
    {
     String str=ae.getActionCommand();
     char ch=str.charAt(0);
     if(Character.isDigit(ch))
      {
       if(op=='+'||op=='-'||op=='*'||op=='/'||op=='%')
        {
         t1.setText(str);
         a=op;
         op=' ';
        }
       else{
         t1.setText(t1.getText()+str);}
       }
         else if(str.equals("add"))
           {
             v1=Integer.parseInt(t1.getText());
             op='+';
           }
          else if(str.equals("sub"))
           {
            v1=Integer.parseInt(t1.getText());
            op='-';
           }
          else if(str.equals("mul"))
           {
            v1=Integer.parseInt(t1.getText());
            op='*';
           }
          else if(str.equals("div"))
           {
            v1=Integer.parseInt(t1.getText());
            op='/';
           }
          else if(str.equals("mod"))
           {
            v1=Integer.parseInt(t1.getText());
            op='%';
           }
           if(str.equals("EQ"))
            {
             v2=Integer.parseInt(t1.getText());
             if(a=='+')
              result=v1+v2;
              if(a=='-')
              result=v1-v2;
              if(a=='*')
              result=v1*v2;
               if(a=='/')
              result=v1/v2;
               if(a=='%')
              result=v1%v2;
              t1.setText(" "+result);
         a=' ';
            }
              if(str.equals("clear"))
                {
                  t1.setText(" ");
                 }
             }
         }