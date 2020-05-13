#include<iostream>
int power(int m,int n)
{
    int j,i;
    for(i=1,j=1;i<=n;i++)
        j=j*m;
    return j;
}
int arm(int n)
{
  int sum=0,t,f=0,d,d_c=0;
  t=n;
  while(n>0)
  {
    d_c++;
    n=n/10;
  }
  n=t;
  while(n>0)
  {
    d=n%10;
    sum=sum+power(d,d_c);
    n=n/10;
  }
  if(t==sum)
    return 1;
  else 
    return 0;//Your code goes here
}
int main()
{
    int n;
    std::cin>>n;
    if(arm(n)==1)
        std::cout<<"Kindly proceed with encrypting";
    else
        std::cout<<"It is not an Armstrong number";
    
}