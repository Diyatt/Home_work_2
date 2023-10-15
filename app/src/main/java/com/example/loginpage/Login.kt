import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.EditText
import android.widget.Toast
import com.example.loginpage.R

class Login : AppCompatActivity() {

    private lateinit var usernameEditText: EditText
    private lateinit var passwordEditText: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login_page)

        // Initialize UI elements
        usernameEditText = findViewById(R.id.usernameEditText)
        passwordEditText = findViewById(R.id.passwordEditText)
    }

    fun onLoginClick(view: android.view.View) {
        val username = usernameEditText.text.toString()
        val password = passwordEditText.text.toString()

        // Perform authentication here, e.g., check against a database or server.
        // For simplicity, we'll just check for a sample username and password.
        if (username == "your_username" && password == "your_password") {
            // Authentication successful
            Toast.makeText(this, "Successfully", Toast.LENGTH_SHORT).show()
            // You can navigate to another activity or perform other actions here.
            // Example: startActivity(Intent(this, HomeActivity::class.java))
        } else {
            // Authentication failed
            Toast.makeText(this, "Invalid credentials", Toast.LENGTH_SHORT).show()
        }
    }
}
