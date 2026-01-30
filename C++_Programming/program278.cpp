// OOP approach (Specific Programming)

#include<iostream>
using namespace std;

class Arithematic
{
    public:
        int No1;
        int No2;

    Arithematic(int A, int B)
    {
        No1 = A;
        No2 = B;
    }

    int Addition()
    {
        int Ans = 0;
        Ans = No1 + No2;
        return Ans;
    }

    int Substraction()
    {
        int Ans = 0;
        Ans = No1 - No2;
        return Ans;
    }

};

int main()
{
    Arithematic aObj1(11,10);
    Arithematic aObj2(101,50);

    cout<<"Addition is : "<<aObj1.Addition()<<"\n";
    cout<<"Substraction is : "<<aObj1.Substraction()<<"\n";

    cout<<"Addition is : "<<aObj2.Addition()<<"\n";
    cout<<"Substraction is : "<<aObj2.Substraction()<<"\n";


    return 0;
}