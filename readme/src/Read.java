

<?xml version="1.0" ?>

<!DOCTYPE Course_Catalog [
<!ELEMENT Course ( Title, Description? ) >
<!ATTLIST Course Enrollment NMTOKEN #IMPLIED >
<!ATTLIST Course Instructors CDATA #REQUIRED >
<!ATTLIST Course Number ID #REQUIRED >
<!ATTLIST Course Prerequisites CDATA #IMPLIED >
<!ELEMENT Course_Catalog ( Department+ ) >
<!ELEMENT Courseref EMPTY >
<!ATTLIST Courseref Number NMTOKEN #REQUIRED >
<!ELEMENT Department ( Course | Lecturer | Professor | Title )* >
<!ATTLIST Department Chair NMTOKEN #REQUIRED >
<!ATTLIST Department Code NMTOKEN #REQUIRED >
<!ELEMENT Description ( #PCDATA | Courseref )* >
<!ELEMENT First_Name ( #PCDATA ) >
<!ELEMENT Last_Name ( #PCDATA ) >
<!ELEMENT Lecturer ( First_Name | Last_Name | Middle_Initial )* >
<!ATTLIST Lecturer InstrID NMTOKEN #REQUIRED >
<!ELEMENT Middle_Initial ( #PCDATA ) >
<!ELEMENT Professor ( First_Name | Last_Name | Middle_Initial )* >
<!ATTLIST Professor InstrID ID #REQUIRED >
<!ELEMENT Title ( #PCDATA ) >

]>

<Course_Catalog>

  <Department Code="CS" Chair="JW">
    
    <Title>Computer Science</Title>

    <Course Number="CS106A" Instructors="JC ER MS" Enrollment="1070">
      <Title>Programming Methodology</Title>
      <Description>Introduction to the engineering of computer applications emphasizing modern software engineering principles.</Description>
    </Course>
    
    <Course Number="CS106B" Prerequisites="CS106A" Instructors="JC ER" Enrollment="620">
      <Title>Programming Abstractions</Title>
      <Description>Abstraction and its relation to programming.</Description>
    </Course>
  
    <Course Number="CS107" Prerequisites="CS106B" Instructors="JZ" Enrollment="500">
      <Title>Computer Organization and Systems</Title>
      <Description>Introduction to the fundamental concepts of computer systems.</Description>
    </Course>
  
    <Course Number="CS109" Prerequisites="CS106B" Instructors="MS" Enrollment="280">
      <Title>Introduction to Probability for Computer Scientists</Title>
    </Course>

    <Course Number="CS124" Prerequisites="CS107 CS109" Instructors="DJ" Enrollment="60">
      <Title>From Languages to Information</Title>
      <Description>Natural language processing. Cross-listed as <Courseref Number="LING180"/>.</Description>
    </Course>

    <Course Number="CS143" Prerequisites="CS107" Instructors="AA" Enrollment="90">
      <Title>Compilers</Title>
      <Description>Principles and practices for design and implementation of compilers and interpreters.</Description>
    </Course>
    
    <Course Number="CS145" Prerequisites="CS107" Instructors="JW" Enrollment="130">
      <Title>Introduction to Databases</Title>
      <Description>Database design and use of database management systems for applications.</Description>
    </Course>

    <Course Number="CS221" Prerequisites="CS107" Instructors="AN ST" Enrollment="180">
      <Title>Artificial Intelligence: Principles and Techniques</Title>
    </Course>
    
    <Course Number="CS228" Instructors="DK" Enrollment="110">
      <Title>Structured Probabilistic Models: Principles and Techniques</Title>
      <Description>Using probabilistic modeling languages to represent complex domains.</Description>
    </Course>

    <Course Number="CS229" Instructors="AN" Enrollment="320">
      <Title>Machine Learning</Title>
      <Description>A broad introduction to machine learning and statistical pattern recognition.</Description>
    </Course>
    
    <Professor InstrID="AA">
      <First_Name>Alex</First_Name>
      <Middle_Initial>S.</Middle_Initial>
      <Last_Name>Aiken</Last_Name>
    </Professor> 
    
    <Lecturer InstrID="JC">
      <First_Name>Jerry</First_Name>
      <Middle_Initial>R.</Middle_Initial>
      <Last_Name>Cain</Last_Name>
    </Lecturer>

    <Professor InstrID="DK">
      <First_Name>Daphne</First_Name>
      <Last_Name>Koller</Last_Name>
    </Professor>
    
    <Professor InstrID="AN">
      <First_Name>Andrew</First_Name>
      <Last_Name>Ng</Last_Name>
    </Professor>
    
    <Professor InstrID="ER">
      <First_Name>Eric</First_Name>
      <Last_Name>Roberts</Last_Name>
    </Professor>
    
    <Professor InstrID="MS">
      <First_Name>Mehran</First_Name>
      <Last_Name>Sahami</Last_Name>
    </Professor>
    
    <Professor InstrID="ST">
      <First_Name>Sebastian</First_Name>
      <Last_Name>Thrun</Last_Name>
    </Professor>    

    <Professor InstrID="JW">
      <First_Name>Jennifer</First_Name>
      <Last_Name>Widom</Last_Name>
    </Professor>

    <Lecturer InstrID="JZ">
      <First_Name>Julie</First_Name>
      <Last_Name>Zelenski</Last_Name>
    </Lecturer>
    
  </Department>

  <Department Code="EE" Chair="MH">
  
    <Title>Electrical Engineering</Title>
  
    <Course Number="EE108A" Instructors="SM">
      <Title>Digital Systems I</Title>
      <Description>Digital circuit, logic, and system design.</Description>
    </Course>
    
    <Course Number="EE108B" Prerequisites="EE108A CS106B" Instructors="WD OO">
      <Title>Digital Systems II</Title>
      <Description>The design of processor-based digital systems.</Description>
    </Course>

    <Professor InstrID="WD">
      <First_Name>William</First_Name>
      <Middle_Initial>J.</Middle_Initial>
      <Last_Name>Dally</Last_Name>
    </Professor>    
    
    <Professor InstrID="MH">
      <First_Name>Mark</First_Name>
      <Middle_Initial>A.</Middle_Initial>
      <Last_Name>Horowitz</Last_Name>    
    </Professor>
    
    <Professor InstrID="SM">
      <First_Name>Subhasish</First_Name>
      <Last_Name>Mitra</Last_Name>
    </Professor>
    
    <Professor InstrID="OO">
      <First_Name>Oyekunle</First_Name>
      <Last_Name>Olukotun</Last_Name>
    </Professor>
  
  </Department>

  <Department Code="LING" Chair="BL">
  
    <Title>Linguistics</Title>
    
    <Course Number="LING180" Prerequisites="CS107 CS109" Instructors="DJ" Enrollment="60">
      <Title>From Languages to Information</Title>
      <Description>Natural language processing. Cross-listed as <Courseref Number="CS124"/>.</Description>
    </Course>
    
    <Professor InstrID="DJ">
      <First_Name>Dan</First_Name>
      <Last_Name>Jurafsky</Last_Name>    
    </Professor>

    <Professor InstrID="BL">
      <First_Name>Beth</First_Name>
      <Last_Name>Levin</Last_Name>    
    </Professor>
    
  </Department>
  
</Course_Catalog>
