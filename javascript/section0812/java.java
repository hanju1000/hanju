import java.awt.*;
import java.awt.event.*;

public class Calculator5 extends Frame implements ActionListener // 계산기
{

 int state=5;   // 사칙연산 상태값
 double after=0;   // 나중에 입력한 숫자
 double sum=0;     // 총합
 private double sum1=0;      // 연산 메소드를 위하여 정의
 int ss=1;      // 판별을 위한 변수  값이 있으면 숫자 처음부터 넣을수 있다.
 private int sst=0;    // . 을 위한 변수
 double mr=0;   //mr을 위한 변수
 String bs;    // 백스페이스를 위한 변수
 char bs1;    // 백스페이스를 위한 변수
 char bs2;    // 백스페이스를 위한 변수

 public Calculator5(String str)
 {
  super(str);  // 프래임의 이름을 정해주는거
 }

 //메뉴바 생성
 MenuBar mb = new MenuBar();
 
 // 패널
 Panel p0 = new Panel();   
 Panel p1 = new Panel();   
 Panel p2 = new Panel();
 Panel p3 = new Panel();
 Panel p4 = new Panel();   
 Panel p5 = new Panel();
 Panel p6 = new Panel();


 // 텍스트 필드를 라벨로 바꿔 보았다.
 // static TextField tf = new Textfield(35,2);
 private int tft[]=new int[35];
 static Label tf = new Label("                                                                                0",2); //70번 ㅡㅡ; 라벨 구현방법을 제대로 몰라서.. 이런방법으로..
 

 // 버튼입력
 Button bt1 = new Button("7");
 Button bt2 = new Button("8");
 Button bt3 = new Button("9");
 Button bt4 = new Button("/");
 Button bt5 = new Button("sqrt");
 Button bt6 = new Button("4");
 Button bt7 = new Button("5");
 Button bt8 = new Button("6");
 Button bt9 = new Button("*");
 Button bt10 = new Button("%");
 Button bt11 = new Button("1");
 Button bt12 = new Button("2");
 Button bt13 = new Button("3");
 Button bt14 = new Button("-");
 Button bt15 = new Button("1/x");
 Button bt16 = new Button("0");
 Button bt17 = new Button("+/-");
 Button bt18 = new Button(".");
 Button bt19 = new Button("+");
 Button bt20 = new Button("=");
 Button btm = new Button("  ");
 Button btmc = new Button("MC");
 Button btmr = new Button("MR");
 Button btms = new Button("MS");
 Button btmp = new Button("M+");
 Button btbs = new Button("BackSpace");
 Button btce = new Button("CE");
 Button btc = new Button("C");

 public void north()
 {
  //프레임 사이즈 설정
  setSize(300,240);
  
  //패널의 레이아웃 정의
  p0.setLayout(new BorderLayout(5,5));
  p3.setLayout(new GridLayout(5,1,5,5));  // 5,1 배열로 정렬하고 가로5,세로5만큼의 간격을 준다.
  p4.setLayout(new BorderLayout(5,5));       // 이놈은 정의를 해줘야한다.
  p5.setLayout(new GridLayout(1,3,5,5));
  p6.setLayout(new GridLayout(4,5,5,5));

  //컴포넌트 배치
  // 버튼 붙여보기
  p1.add(tf);
  p0.add(p1,BorderLayout.NORTH);
  p0.add(p2,BorderLayout.CENTER);   // p0 에 p1을 위로 p2를 아래로 배치한다.
  p3.setForeground(Color.red); // p3의 글자의 색을 빨간색으로 정의한다.
  p3.add(btm);
  p3.add(btmc);
  p3.add(btmr);
  p3.add(btms);
  p3.add(btmp);
  p2.add(p3, BorderLayout.WEST);
  p2.add(p4, BorderLayout.CENTER); // p2 에 p3는 왼쪽,p4는 중앙에 배치한다.
  p5.setForeground(Color.red);     // p5의 글자색을 빨간색으로 정의
  p5.add(btbs);
  p5.add(btce);
  p5.add(btc);
  p6.setForeground(Color.blue);
  p6.add(bt1);     // 7
  p6.add(bt2);     // 8
  p6.add(bt3);     // 9
  p6.add(bt4);     // /
  p6.add(bt5);     // sqrt
  p6.add(bt6);     // 4
  p6.add(bt7);     // 5
  p6.add(bt8);     // 6
  p6.add(bt9);     // *
  p6.add(bt10);    // %
  p6.add(bt11);    // 1
  p6.add(bt12);    // 2
  p6.add(bt13);    // 3
  p6.add(bt14);    // -
  p6.add(bt15);    // 1/x
  p6.add(bt16);    // 0
  p6.add(bt17);    // +/-
  p6.add(bt18);    // .
  p6.add(bt19);    // +
  p6.add(bt20);    // =
  p4.add(p5, BorderLayout.NORTH);     
  p4.add(p6, BorderLayout.CENTER);    // p4 에 p5는 위로 p6는 아래로 배치
  bt4.setForeground(Color.red);
  bt9.setForeground(Color.red);
  bt14.setForeground(Color.red);
  bt19.setForeground(Color.red);
  bt20.setForeground(Color.red);

  tf.setBackground(Color.white);
  
  this.add(p0);      // p0에 전부 다 집어넣었기 때문에 p0만 출력 하면된다. 출력하는 부분..

  
  setBackground(Color.lightGray);  // 뒷 배경을 라이트그래이 색으로 지정

  bt1.addActionListener(this);     // 버튼에 이벤트생성 이거 안해놓으면 버튼 아무리 눌러도 소용없음
  bt2.addActionListener(this);
  bt3.addActionListener(this);
  bt4.addActionListener(this);
  bt6.addActionListener(this);
  bt7.addActionListener(this);
  bt8.addActionListener(this);
  bt9.addActionListener(this);
  bt11.addActionListener(this);
  bt12.addActionListener(this);
  bt13.addActionListener(this);
  bt14.addActionListener(this);
  bt16.addActionListener(this);
  bt19.addActionListener(this);
  bt20.addActionListener(this);
  bt5.addActionListener(this);
  btbs.addActionListener(this);
  btc.addActionListener(this);
  bt15.addActionListener(this);
  bt10.addActionListener(this);
  bt18.addActionListener(this);
  bt17.addActionListener(this);
  btce.addActionListener(this);
  btmr.addActionListener(this);
  btmc.addActionListener(this);
  btmp.addActionListener(this);
  btms.addActionListener(this);

  // btm 의 정의
  btm.setBackground(Color.gray);   // 왼쪽에 사용안하는 버튼을 위해..
  btm.setEnabled(false);   // 요렇게 하면 사용못한데요..
  tf.setEnabled(false);    // 현진이가 찾은 버그 해결법

  // 메뉴바는 위에서 정의했다.
  // 메뉴를 넣어보자
  Menu m = new Menu(); //메뉴 생성

  m.setLabel("편집"); //메뉴바의 첫 번 째 메뉴

  MenuItem mi = new MenuItem("복사(c)",new MenuShortcut(KeyEvent.VK_C)); //메뉴 아이템 생성 단축키까지 생성
        m.add(mi); //서브 메뉴에 넣는다.
       
        mi = new MenuItem("붙여넣기(v)",new MenuShortcut(KeyEvent.VK_V)); //메뉴 아이템 생성
        m.add(mi); //서브 메뉴에 넣는다.

        Menu m1 = new Menu();
  m1.setLabel("보기"); //메뉴바의 첫 번 째 메뉴

  mi = new MenuItem(); //메뉴 아이템 생성
        mi.setLabel("일반용");
        m1.add(mi); //서브 메뉴에 넣는다.
       
        mi = new MenuItem(); //메뉴 아이템 생성
        mi.setLabel("공학용");
  mi.setEnabled(false);
        m1.add(mi); //서브 메뉴에 넣는다.

  mi = new MenuItem(); //메뉴 아이템 생성
        mi.setLabel("자릿수구분단위");
        m1.add(mi); //서브 메뉴에 넣는다.

  Menu m2 = new Menu();
  m2.setLabel("도움말"); //메뉴바의 첫 번 째 메뉴
       
  mi = new MenuItem(); //메뉴 아이템 생성
        mi.setLabel("도움말항목");
        m2.add(mi); //서브 메뉴에 넣는다.
       
        mi = new MenuItem(); //메뉴 아이템 생성
        mi.setLabel("계산기정보");
        m2.add(mi); //서브 메뉴에 넣는다.

  mb.add(m); //메뉴바에 메뉴를 넣는다.
  mb.add(m1);
  mb.add(m2);

  this.setMenuBar(mb); //프레임에 메뉴바를 넣는다.


  setVisible(true);  // 프래임을 보여줘~!!
  setResizable(false);  // 사이즈 조정 안되게
 }
 
 // 버튼 이벤트
 public void actionPerformed(ActionEvent e) 
 {
/////////////////////////////////////////////////////////////////////////////////////////////숫자패트//
  try{
  if(e.getSource() == bt11)    // 1
  {
   if (ss!=0)               // tf 안에 숫자가 없으면 지우고 1만 출력
   {
    tf.setText("");
    tf.setText("1");
    ss=0;                // 요건 tf 안에 숫자가 있는지 없는지 판별하기 위해 넣었음
   }
   else
   tf.setText(tf.getText()+"1");              // tf 안에 숫자가 있다면 그 숫자 뒤에 1을 붙인다.
  }
  else if(e.getSource() == bt12)
  {
   if (ss!=0)
   {
    tf.setText("");
    tf.setText("2");
    ss=0;
   }
   else
   tf.setText(tf.getText()+"2");
  }
  else if(e.getSource() == bt13)
  {
   if (ss!=0)
   {
    tf.setText("");
    tf.setText("3");
    ss=0;
   }
   else
   tf.setText(tf.getText()+"3");
  }
  else if(e.getSource() == bt6)
  {
   if (ss!=0)
   {
    tf.setText("");
    tf.setText("4");
    ss=0;
   }
   else
   tf.setText(tf.getText()+"4");
  }
  else if(e.getSource() == bt7)
  {
   if (ss!=0)
   {
    tf.setText("");
    tf.setText("5");
    ss=0;
   }
   else
   tf.setText(tf.getText()+"5");
  }
  else if(e.getSource() == bt8)
  {
   if (ss!=0)
   {
    tf.setText("");
    tf.setText("6");
    ss=0;
   }
   else
   tf.setText(tf.getText()+"6");
  }
  else if(e.getSource() == bt1)
  {
   if (ss!=0)
   {
    tf.setText("");
    tf.setText("7");
    ss=0;
   }
   else
   tf.setText(tf.getText()+"7");
  }
  else if(e.getSource() == bt2)
  {
   if (ss!=0)
   {
    tf.setText("");
    tf.setText("8");
    ss=0;
   }
   else
   tf.setText(tf.getText()+"8");
  }
  else if(e.getSource() == bt3)
  {
   if (ss!=0)
   {
    tf.setText("");
    tf.setText("9");
    ss=0;
   }
   else
   tf.setText(tf.getText()+"9");
  }
  else if(e.getSource() == bt16)
  {
   if (ss!=0)
   {
    tf.setText("");
    tf.setText("0");
    ss=0;
   }
   else
   tf.setText(tf.getText()+"0");
  }
/////////////////////////////////////////////////////////////////////////////////////////////4칙연산//
  else if (e.getSource() == bt19)
  {
   after = Double.parseDouble(tf.getText());
   ss=state;                              // 숫자패드에서 숫자를 넣을때 값을 초기화 하기 위해 넣었다. 자세한건 위에 숫자패드에 설명
   sst=0;                                 // 이부분은 소수점을 찍기 위해 4칙연산을 누르면 0으로 초기화 자세한건 기타버튼에 설명
   if(state==5)
   {
    sum=after;
   }
   else
   sum=this.math(sum,after);              // 연산값을 기억해뒀다가 다음 연산 눌렀을때 계산하는 메소드를 호출
   this.print(sum);                       // 더블형과 인트형을 구분해서 출력하는 매소드 호출
   state= 1;                              // = 을 눌렀을때 마지막으로 연산한게 무었인지 확인하기 위한 상태값
  }
  else if (e.getSource() == bt14)                  // 마이너스 연산... 제일 힘들었음..
  {
   after = Double.parseDouble(tf.getText());
   ss=state;
   sst=0;
   if(state==5)
   {
    sum=after;
   }
   else
   sum=this.math(sum,after); 
   this.print(sum);          
   state = 2;
  }
  else if (e.getSource() == bt9)
  {
   after = Double.parseDouble(tf.getText());
   
   if (sum==0)          // 이부분은 곱셈,나눗셈할때 sum값이 없을땐 값이 0이 나오므로 1값을 주었다.
   {
    sum=1;
   }
   ss=state;
   sst=0;
   if(state==5)
   {
    sum=after;
   }
   else
   sum=this.math(sum,after); 
   this.print(sum);          
   state = 3;

  }
  else if (e.getSource() == bt4)
  {
   after = Double.parseDouble(tf.getText());
   if (sum==0)
   {
    sum=1;
   }
   ss=state;
   sst=0;
   if(state==5)
   {
    sum=after;
   }
   else
   sum=this.math(sum,after); 
   this.print(sum);          
   state = 4;

  }
  else if (e.getSource() == bt20)               // = 값이다.  =을 누르면 앞에 계산했던것을 호출해야 되기때문에 상태값으로 확인후 연산에 들어간다.
  {
   after = Double.parseDouble(tf.getText());
   ss=state;
   sst=0;
   sum=this.math(sum,after); 
   this.print(sum);          
   after=0;
   state=5;

  }
/////////////////////////////////////////////////////////////////////////////////////////////기타버튼//
  else if (e.getSource() == btbs)           // 백스페이스   BackSpace
  {
   bs=tf.getText();                      // tf에 있는 값을 스트링으로 받아서
   String bs1=tf.getText();
   int idx = bs1.indexOf("-");
   int length = bs1.length();
   if (length==1)
   {
    tf.setText("0");
   }
   else if (length==2 && idx==0)
   {
    tf.setText("0");
   }
   else
   {
    try{                                  // length 값이 - 가 나오면 에러나와서 여기서 try-catch문을 넣었다.
    bs=bs.substring(0,(bs.length()-1));   // 스트링값 0 부터 마지막꺼 -1 시켜서
    after=Double.parseDouble(tf.getText());
    
   
    ss=(int)after;
    if ((after-ss) ==0)                   // 지우면서 소수점이 있는지 없는지 판변하는 부분
    {
     sst=0;
    }
    else
    sst=1;
   
   
    }catch(Exception ee)
    {
     tf.setText("0");
     sst=0;
    }
    tf.setText(bs);        // 그 값을 tf로 전송
   }
  }
  else if (e.getSource() == btc)                // 초기화  C
  {
   tf.setText("0");                          // tf에 0을 넣어주고 after 초기화
   after=0;
   sum=0;
   sst=0;                                    // 탁준이가 찾은 버그 c 를 누르면 소수점이 안찍히던 문제해결
   ss=1;                                     // 숫자패드에 처음부터 넣으라고 지시 자세한건 숫자패드부분에..
  }
  else if (e.getSource() == bt15)               // 역수 1/x   
  {
   after = Double.parseDouble(tf.getText());
   after=1/after;
   tf.setText(String.valueOf(after));
   after=0;
   ss=1;
  }
  else if (e.getSource() == bt10)                 // % 퍼센트  ㅋㅋ %를 몰라서 성호형님과 성진형님의 도움을 받았다.
  {
   after= Double.parseDouble(tf.getText());
   if(state == 1)                              // 이거 역시 4칙연산이 들어가더라..
   {
    sum=sum + after/100;
   }
   else if(state == 2)
   {
    sum=sum - after/100;
   }
   else if(state == 3)
   {
    sum=sum * after/100;
   }
   else if(state == 4)
   {
    sum =sum / after/100;
   }
   after=0;
   ss=state;
   this.print(sum);
  }
  else if(e.getSource() == bt18)                  //   소수점 .
  {
   if (sst==0)                                 // 위에 사칙연산을 누르면 다시 활성화 된다.
   {
    tf.setText(tf.getText()+".");
    sst=1;                                  // 이건 점을 두번찍지 못하게 하기 위해 넣은 숫자
    ss=0;
   }
   after = Double.parseDouble(tf.getText());
  }
  else if(e.getSource() == bt17)                  //   음양수변환 .
  {
   after = Double.parseDouble(tf.getText());  // 인티저형이나 더블형이나 그냥 -1 곱하면 된다.
   after = (after * (-1));
   this.print(after);  
  }
  
  else if(e.getSource() == bt5)             //   sqrt 제곱근
  {
   after = Double.parseDouble(tf.getText());
   after = Math.sqrt(after);       // 제곱근 변환 메소드를 사용해봤다. 성진형님 고마워요~
   this.print(after);  
  }
///////////////////////////////////////////////////////////////////////////////////////////////메모리버튼
  else if(e.getSource() == btce)                  // 마지막꺼만 초기화
  {
   tf.setText("0");
   ss=1;
   sst=0;
  }
  else if(e.getSource() == btmc)                  // 메모리 초기
  {
   mr=0;
  }
  else if(e.getSource() == btmp)                  // 메모리 더하기
  {
   if (mr==0)                                  // 요기두 탁준이가 찾은 버그 mr 값이 이상하게 나오던 부분..
   {
    mr=Double.parseDouble(tf.getText());
   }
   else
   mr = mr + Double.parseDouble(tf.getText());
   after=0;
   ss=1;                                       // 탁준이가 찾은 디버그 ms 값하고 m+ 값에 ss를 값을 안주니까 그대로 진행되는듯
  }
  else if(e.getSource() == btms)                  // 메모리 빼기
  {
   if (mr==0)
   {
    mr=Double.parseDouble(tf.getText());
   }
   else
   mr = mr - Double.parseDouble(tf.getText());
   after=0;
   ss=1;
  }
  else if(e.getSource() == btmr)                  // 메모리값 출력
  {
   this.print(mr);  
  }
  }catch(Exception eee){}
 }


 public double math(double sum4,double after2)
 {
  if(state == 1)
  {
   sum4=sum4 + after2;
  }
  else if(state == 2)
  {
   sum4=sum4-after2;
  }
  else if(state == 3)
  {
   sum4=sum4 * after2;
  }
  else if(state == 4)
  {
   sum4 =sum4 / after2;
  }
  else if (state == 5)
  {
   after = Double.parseDouble(tf.getText());
   sum4 = after;
  }
  sum1=sum4;
  return sum1;
 }

 public void print(double sum3)    // 더블형과 인티저형을 구분해서 출력
 {
  int sum1=(int)sum3;        // 기본적으로 더블형이어서 출력하는부분이 소수가 아닐경우에는 인트형으로 출력하기위해 넣었다.
  if ((sum3-sum1)==0)
  {
   tf.setText(String.valueOf(sum1));        // 인트형 출력
  }
  else
  tf.setText(String.valueOf(sum3));             // 더블형 출력
  sst=0;
 }
 public static void main(String[] args)
 {
  Calculator5 pe = new Calculator5("북두의 계산기V1.7");
  pe.north();
 }
}  


// ㅋ 드뎌 완성.. 아직 final을 붙이긴 뭐하지만.. 혼합연산까지도 가능.. 실제 계산기와 똑같이 계산 가능합니다.
// 버그테스트 해보시고 버그 나오면 북두를 불러주삼..!!!