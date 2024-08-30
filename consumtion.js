const distance = parseInt(prompt("Enter the total distance (in Km):")); 
const fuelSpent = parseFloat(prompt("Enter the total fuel spent (in liters):")); 
const averageConsumption = distance / fuelSpent;
console.log(averageConsumption.toFixed(3) + " km/l");
