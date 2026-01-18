const readline = require('readline');

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

function bmiCalculatorFormula(weight, height) {
  const heightInMeters = height / 100;
  const bmiValue = weight / (heightInMeters * heightInMeters);
  return bmiValue;
}

function bmiDisplayResult(bmiValue) {
  if (bmiValue < 18.5) {
    console.log("You are Underweight");
  } else if (bmiValue >= 18.5 && bmiValue <= 24.9) {
    console.log("You are Normal weight");
  } else if (bmiValue >= 25.0 && bmiValue <= 29.9) {
    console.log("You are Overweight");
  } else {
    console.log("You are obese");
  }
}

console.log("WELCOME to Ada's BMICalculator!!!");
console.log("Notice: This Calculator is intended for use by individuals over the age of 18");

rl.question("Enter your Gender: ", (_gender) => {
  rl.question("Enter your Weight in kg: ", (weightInput) => {
    const weight = parseFloat(weightInput);

    rl.question("Enter your Height in cm: ", (heightInput) => {
      const height = parseFloat(heightInput);

      const bmiValue = bmiCalculatorFormula(weight, height);
      bmiDisplayResult(bmiValue);

      rl.close();
    });
  });
});

