const time = parseInt(prompt("Enter the time spent on the trip (in hours):"));
const speed = parseInt(prompt("Enter the average speed during the trip (in km/h):"));

// Calculate the distance
const distance = time * speed;

// Calculate fuel needed
const fuelNeeded = distance / 12;

// Print the result with three decimal places
console.log(fuelNeeded.toFixed(3));
