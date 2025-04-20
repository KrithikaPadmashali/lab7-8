document.addEventListener("DOMContentLoaded", function() {
    console.log("JavaScript Loaded");

    const form = document.querySelector("form");
    if (form) {
        form.addEventListener("submit", function(event) {
            alert("Form submitted successfully!");
        });
    }
});
