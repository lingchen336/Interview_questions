/*
https://www.nowcoder.com/test/question/done?tid=36010894&qid=579629#summary

Small Bank corporation有如下的员工数据库，为下面每个查询语句写出SQL表达式:

Employee 员工表
员工姓名employee_name
所住街道 street
所在城市city

Company 公司信息表
公司名称 company_name
所在城市 city

Works 工作信息表
员工姓名 employee_name
公司名称 company_name
薪水 salary

1)  找出所有为Small Bank corporation工作且薪金超过10000的员工的名字、居住的街道和城市

2)  查找数据库中所有居住城市和公司所在城市相同的员工

3)  找出数据库中所有工资高于Small Bank corporation的每一个员工工资的员工姓名

4)  假设一家公司可以在好几个城市有分部，找出所有这样的公司，其所在城市包含了Small Bank corporation所在的每一个城市

5)  找出平均工资高于Small Bank corporation平均工资的所有公司名字及平均工资


1) select stree,city,employee_name from Employee,Works Where Employee.employee_name=Works.employee_name and Works.company_name='Small Bank corporation' and salary>10000;

2) select Employ_name from Employee,(select city,employee_name from Company,Works where Company.company_name= Works.company_name) A where Employ.employee_name = A.employee_name and Employee.city=A.city;

3) select emloyee_name from Works where salary > all (select salary from Works where Company_name='Small Bank corporation');

4) selec a.company_name from Company a where not exists((select b.city from Company b where b.company_name= 'Small Bank corporation') except (select c.city from Company c where a.company_name = c.company_name));-------参考楼上的

5）select a.company_name avg(salary) from Works a where group by a.company_name having  avg(a.salary) > (select avg(b.salary) from Works b where b.company_name =Small Bank corporation");





*/
