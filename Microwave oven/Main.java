#include<iostream>
using namespace std;
int main()
{
  int i;
  float ht,rh;
  cin>>i>>ht;
  if(i<=3)
  {
    if(i==2) {
      cout<<(ht*0.5+ht);
    }
    else if(i==3) {
      cout<<ht*2;
    }
    else {
      cout<<ht;
    }
  }
  else {
    cout<<"Number of items is more";
  }//Type your code here.
}