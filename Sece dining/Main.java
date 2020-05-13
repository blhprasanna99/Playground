#include<iostream>
using namespace std;
int main()
{
  int n;
  string a;
  cin>>a>>n;
  if(a=="front")
  {
    if(n==1)
      cout<<"Left Handed";
    else
      cout<<"Right Handed";
  }
  else
  {
    if(n==1)
      cout<<"Right Handed";
    else
      cout<<"Left Handed";
  }//Type your code here.
}