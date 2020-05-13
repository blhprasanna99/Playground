#include<iostream>
using namespace std;
int main()
{ 
  int fa,fd,fs,sa,sd,ss,aa,ad,as,fp,sp,ap;
  float pf,pa,ps;
  cin>>fa>>fd>>fs>>sa>>sd>>ss>>aa>>ad>>as;
  pf=fa-(fa*fd/100);
  fp=pf+fs;
  pa=aa-(aa*ad/100);
  ap=pa+as;
  ps=sa-(sa*sd/100);
  sp=ps+ss;
  cout<<"In Flipkart Rs."<<fp;
  cout<<"\nIn Snapdeal Rs."<<sp;
  cout<<"\nIn Amazon Rs."<<ap;
  if(fp<ap||sp<ap) {
    if(fp<=sp){ 
    cout<<"\nHe will prefer Flipkart";
    }
    else {
      cout<<"\nHe will prefer Snapdeal";
    }
  }
  else
  {
    cout<<"\nHe will prefer Amazon";
  }//Type your code here.
  //Type your code here.
}