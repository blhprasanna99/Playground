#include<iostream>
using namespace std;
int main()
{
  int units,bill;
  cin>>units;
  if(units<=200)
  {
    bill=(units*0.5);
  }
  else if(units>200 &&units<=400)
  {
    bill=(units*0.65)+100;
  }
  else if(units>400 && units<=600)
  {
    bill=(units*0.80)+200;
  }
  else 
  {
    bill=(units*1.25)+425;
  }
  cout<<"Rs."<<bill;//Type your code here.
}