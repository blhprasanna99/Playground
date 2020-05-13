#include<iostream>
#include<math.h>
using namespace std;
int main()
{
  int nd,k,l,i,temp,r,n,s;
  cin>>k;
  n=k*k;
  temp=k;
   while(k>0)
  {
    nd=nd+1;
    k=k/10;
  }
  if(temp>=9)
  {
  r=n/(pow(10,nd));
  l=n%(int)(pow(10,nd));
  s=r+l;
  if(s==temp)
      cout<<"Kaprekar Number";
  else 
    cout<<"Not a Kaprekar Number";
  }
  else
  {
    printf("Not a Kaprekar Number");
  }//Type your code here.
}//r code here.