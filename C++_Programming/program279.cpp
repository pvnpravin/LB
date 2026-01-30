// OOP Approach (Generic Programming)

#include<iostream>
using namespace std;

template <class T>
class Arithematic
{
    public:
        T No1;
        T No2;

    Arithematic(T A, T B)
    {
        No1 = A;
        No2 = B;
    }

    T Addition()
    {
        T Ans = 0;
        Ans = No1 + No2;
        return Ans;
    }

    T Substraction()
    {
        T Ans = 0;
        Ans = No1 - No2;
        return Ans;
    }

};

int main()
{
    Arithematic aObj1(11,10);   //  error: missing template arguments before 'aObj1'
    Arithematic aObj2(101,50);  //  error: missing template arguments before 'aObj2'

    cout<<"Addition is : "<<aObj1.Addition()<<"\n";
    cout<<"Substraction is : "<<aObj1.Substraction()<<"\n";

    cout<<"Addition is : "<<aObj2.Addition()<<"\n";
    cout<<"Substraction is : "<<aObj2.Substraction()<<"\n";


    return 0;
}