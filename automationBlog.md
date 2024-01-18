![image](https://github.com/23W-GBAC/udehadaeze/assets/148863379/90b614ab-1bfa-40e2-8121-1de738bd46dc)

# About Myself & My Automation
Hello, I'm Adaeze Udeh, a first-year Health Informatics student passionate about blending health with technology. In my journey of exploration and learning, I embarked on an exciting automation project – the creation of a BMI (Body Mass Index) calculator.

**What is BMI?**

Body Mass Index (BMI) is a numerical measure of an individual's body fat based on their weight and height. It is a widely used tool in healthcare to quickly assess whether a person has a healthy body weight. BMI is important as it helps identify potential health risks associated with being underweight or overweight, serving as a screening tool for conditions like obesity-related diseases and providing a basis for discussions about lifestyle and health.
As someone diving into the world of health informatics, I found the concept of BMI fascinating and saw an opportunity to contribute to health awareness through automation.

To access my BMI calculator, simply use the link: https://23w-gbac.github.io/udehadaeze/
  

# Blog Post 1: Inception of the BMI Calculator Project

For me, there was some confusion in regards to the Automation Blog. At first I thought the README.md file was the main blog, as a result I dedicated most of my time into constantly updating my README.md file. 

Nevertheless, I am glad to Welcome you to Ada's BMI Calculator Blog Series! In this series, we'll delve into the journey of creating an innovative online BMI calculator. To kick things off, let's explore the inception of this exciting project and the motivations behind it.

**The Idea:**

It all began with a moment of inspiration, a spark fueled by the desire to empower individuals with information about their body composition. The idea of creating a user-friendly online BMI calculator emerged from a profound interest in promoting health awareness and facilitating positive lifestyle choices. Whether driven by a personal commitment to health or a broader vision of contributing to public well-being, the inception of this project was rooted in the belief that knowledge is the key to a healthier life.

**Project Scope:**

My BMI calculator isn't just another online tool; it's a comprehensive platform designed to provide quick and insightful results. With a focus on user-friendly features, my calculator aims to stand out from the crowd. As we delve deeper into the project, you'll discover what makes my BMI calculator unique and how it caters to the diverse needs of its users.

**The Planning Phase:**

Embarking on any project requires meticulous planning, and my BMI calculator was no exception. The initial phase involved thorough research on Body Mass Index (BMI), understanding user needs, and making crucial design considerations. Challenges were met head-on, decisions were carefully weighed, and the blueprint for my innovative BMI calculator began to take shape.

In the planning phase, I grappled with questions that would shape the project's direction. What features would best serve my users? How could I ensure accuracy in BMI calculations? The planning process not only defined the scope of my project but also set the stage for the exciting coding journey ahead.

Stay tuned for the next installment as we dive into the coding process, unraveling the intricacies of turning an idea into a functional BMI calculator!



# Blog Post 2: The Coding Journey

**Introduction:**

As we continue our journey into the development of Ada's BMI Calculator, we transition from the inspiring idea phase to the heart of the project—the coding journey. In this phase, the conceptual vision transforms into a functional tool ready to empower users with valuable health insights.

**Development Tools:**

Choosing the right tools for the development process is crucial. My BMI calculator was crafted using a combination of HTML for the structure, CSS for styling, and JavaScript for dynamic functionality. The decision to opt for these technologies stemmed from their compatibility, versatility, and widespread use, ensuring a seamless user experience across various platforms.
HTML provided the foundation, structuring the content and layout. CSS, with its styling capabilities, added the visually appealing touch to the user interface. JavaScript brought interactivity to the table, allowing dynamic calculations and user-specific information display.
The choice of these technologies not only aligns with industry standards but also reflects a commitment to delivering a user-friendly and accessible BMI calculator.

**BMI Calculation Formula:**

At the core of my BMI calculator lies the BMI calculation formula. The mathematical equation used is BMI = weight / (height * height). This formula, widely accepted for its simplicity and effectiveness, calculates the BMI value based on user-provided weight (in kilograms) and height (in meters).

![image](https://github.com/23W-GBAC/udehadaeze/assets/148863379/aa4d8bf5-4127-4c50-819c-4f5eff4db86f)


**How to use Ada's BMI calculator:**

Using my BMI calculator is a straightforward process that analyzes inputted weight and height for BMI assessment. To get started, follow these simple steps:

1. Access the Calculator:  To access my BMI calculator, simply use the link: https://23w-gbac.github.io/udehadaeze/

2. Gender Selection:  Upon reaching the website, select your gender.

3. Input Weight and Height:  Enter your weight in kilograms and your height in centimeters into the designated fields.

4. Calculation:  Press the "Calculate" button and patiently wait for your result.

5. Result Categorization:  Once the calculation is complete, you will be placed into one of five BMI categories & you would be shown specific content Information depending on the BMI category you fall into. 


**Challenges Faced,Solutions and Optimizations:**

Embarking on the coding journey inevitably presented challenges. From crafting complex algorithms for BMI categorization to addressing unexpected issues during the implementation phase, every challenge was an opportunity to refine and enhance the BMI calculator.
I implemented innovative solutions to ensure a seamless user experience. Algorithmic refinements were made to enhance the accuracy of the BMI categorization. 
Regular code reviews played a pivotal role in identifying areas for improvement. Continuous optimization became a guiding principle, reflecting on my commitment to delivering a top-tier BMI calculator.

**Some of the notable challanges I faced during my Automation include the following:**

1. Input Validation:

For my first challange, Ensuring that users input a numeric value was essential. I implemented input validation using the type="number" attribute in HTML <input> tags. This attribute restricts user input to numeric values, and the required attribute ensures users provide a value for the input fields.
![ensure2](https://github.com/23W-GBAC/udehadaeze/assets/148863379/0ed0fbde-6dd6-488c-8957-2b0bfcc32442)

2. Handling GitHub Pages Linking:

Another challenge I encountered was linking both my index.html file (BMI calculator website) and my automationBlog.md to GitHub Pages. Initially, GitHub Pages displayed only the content of my index.html file. To address this, I needed a way to link both files so that when users are on my BMI calculator website and click the "Automation Blog" link, the page automatically redirects them to my GitHub repository. I solved this problem by creating a blog.html file, which is linked to my index.html. This allows users to access my automation blog post directly from my website.
![redirect](https://github.com/23W-GBAC/udehadaeze/assets/148863379/fdce7c5f-93a6-4acb-b167-9987c445e2ed)

3. Result Precision Control:

I noticed that my BMI calculator was printing results having numerous decimal places. To address this, I wanted the result to have no more than one decimal value. I used toFixed(1) in my JavaScript to limit the result to one decimal place.
![fixed2](https://github.com/23W-GBAC/udehadaeze/assets/148863379/2d344c1a-f71e-4368-94e1-920c8aed34c0)

4.Centering Website Content:

Centering the content of my website posed a challenge. I resolved this by incorporating a container class in my CSS file. The .container class, with max-width and margin: 20px auto; properties, ensures the horizontal centering of content, providing a clean and organized layout.
![container](https://github.com/23W-GBAC/udehadaeze/assets/148863379/893c09bc-6a7f-4d4c-bfa9-49f35884df8a)


**Testing Phase:**

Before conclusion of the project, a testing phase was essential. This involved comprehensive testing of the BMI calculation logic, user interface responsiveness, and the accuracy of category assignments.
This played a vital role, leading to refinements and further enhancements. The iterative testing process not only ensured the reliability of results but also allowed me to incorporate valuable insights.

In the next segment of my blog series, we'll explore the user interface design and the unique features that make Ada's BMI Calculator a standout tool for health-conscious individuals.

Stay tuned for the next installment as we navigate the design intricacies of my BMI calculator!



# Blog Post 3: Designing a User-Centric Interface

**ATTENTION!!! : Please note, to gain a comprehensive understanding & a visual context of the user interface design discussed in this section of the blog post, it is recommended that you visit my BMI calculator website at https://23w-gbac.github.io/udehadaeze/. This visit will provide you with a visual context for the upcoming discussion in this chapter."**

**Introduction:**

Welcome back to Ada's BMI Calculator Blog Series! In the previous installments, we explored the inception and coding journey of this innovative BMI calculator. Now, let's delve into the fascinating realm of user interface design, unraveling the intricacies behind creating a visually appealing and user-friendly BMI calculator.

**User-Centric Design Principles:**

In the world of web development, the user interface serves as the vital link between users and the functionality of the BMI calculator. Ensuring an interface that is intuitive, visually pleasing, and efficient became a top priority in this phase of the project.

**Intuitive Layout:**

The arrangement of elements on the page was meticulously planned for a clean and straightforward experience. The layout focuses on simplicity, allowing users to navigate the BMI calculator without unnecessary distractions. This user-centric design ensures that users can easily input their weight and height, creating a seamless experience.

**Clear Call-to-Action:**

The "Calculate" button takes center stage as the primary call-to-action, strategically positioned after users input their weight and height. Its prominence guides users through the process, ensuring a clear and straightforward path to obtaining their BMI results.

**Visual Feedback:**

The implementation of visual cues is crucial for user feedback. For instance, when the user hovers over the 'Calculate' button, it undergoes a dynamic color transition, changing from a light pink hue to a darker shade of pink. These real-time visual changes, including color shifts, occur seamlessly as users interact with the calculator. This not only enhances the user experience but also assures users that their inputs are being processed effectively

**The Role of CSS in User Interface Enhancement:**

CSS played a pivotal role in elevating the aesthetics of Ada's BMI Calculator. By leveraging CSS properties such as color schemes, font choices, and responsive design, the goal was to create an interface that not only functions well but also captivates the user's attention

1. Color Scheme:

A carefully chosen color palette promotes a sense of calm and professionalism. Subtle shades of pink and white were incorporated, aligning with the overall theme of calmness and serenity. These colors symbolize a sense of delicacy, elegance, and clarity, enhancing the visual aesthetics and contributing to an atmosphere of serenity and refinement. The result is an interface that exudes a reassuring and trustworthy aura.

2. Font Selection:

Typography significantly impacts readability and the overall user experience. A clear and easily readable font was selected to ensure that users can effortlessly absorb the information presented, complementing the simplicity of the layout.

3. User Interaction and Dynamic Results:

The true magic of the BMI calculator lies in its dynamic nature. As users input their weight and height, the interface responds in real-time, providing not just the BMI value but also categorizing it into specific health ranges. This interactive element adds an engaging touch to the user experience, making health assessment a more personalized and insightful journey.

**Conclusion:**

Designing the user interface of Ada's BMI Calculator was a captivating journey that merged functionality with aesthetics. By prioritizing user-centric design principles and leveraging the power of CSS, the BMI calculator now stands as a testament to the seamless integration of form and function.
Stay tuned for the fourth installment, as we conclude Ada's BMI Calculator Blog Series with a comprehensive overview of the project's impact and the road ahead!

**Tools used during the prepartion of this project include: Youtube.com, Chatgpt & Google.com**
 
