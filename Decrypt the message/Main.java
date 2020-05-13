#include<iostream>
using namespace std;
int main()
{
  int en,tn,p,temp=0,i;
  cin>>en>>tn;
  p=en+tn;
  for(i=1;i<p;i++) {
    if(p%i==0) {
      temp=temp+i;
    }
  }
  if(temp==p) {
    cout<<"They can read the message";
  }
  else 
  {
    cout<<"They can't read the message";
  }
  
}