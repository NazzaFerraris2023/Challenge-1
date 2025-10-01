package com.example.firstchallenge.ui.screens


import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.VerticalAlignmentLine
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.firstchallenge.ui.components.TitleComponent
import com.example.firstchallenge.R
import com.example.firstchallenge.ui.components.ButtonComponent
import com.example.firstchallenge.ui.components.InputComponent
import com.example.firstchallenge.ui.components.SmallButton
import com.example.firstchallenge.ui.components.SocialComponent
import com.example.firstchallenge.ui.components.SubTitleComponent

@Composable
fun RegisterScreen(modifier: Modifier) {
    // Implementation of the RegisterScreen goes here
    Column(
        modifier = Modifier,
        verticalArrangement =Arrangement.Top
    ) {
        Column(
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.fillMaxWidth()
        ){
            Spacer(modifier = Modifier.height(60.dp))
            TitleComponent(stringResource(R.string.register_title))
            Spacer(modifier = Modifier.height(20.dp))
            Column(
                verticalArrangement = Arrangement.Top,
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.fillMaxWidth()
            ){
                SubTitleComponent(stringResource(R.string.register_subtitle))

            }

            Spacer(modifier = Modifier.height(20.dp))

            Column(
                verticalArrangement = Arrangement.Top,
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.fillMaxWidth()
            ) {
                InputComponent(stringResource(R.string.login_email_input),
                    modifier = Modifier.width(300.dp).border(
                        width = 2.dp,
                        color = Color(0xff1f41bb),
                        shape = RoundedCornerShape(10.dp),

                        ))
                Spacer(modifier = Modifier.height(10.dp))
                InputComponent(stringResource(R.string.login_pssw_input),
                    modifier = Modifier.width(300.dp).border(
                        width = 2.dp,
                        color = Color(0xff1f41bb),
                        shape = RoundedCornerShape(10.dp),

                        ))
                Spacer(modifier = Modifier.height(10.dp))
                InputComponent(stringResource(R.string.register_confirm_pssw),
                    modifier = Modifier.width(300.dp).border(
                        width = 2.dp,
                        color = Color(0xff1f41bb),
                        shape = RoundedCornerShape(10.dp),

                        ))
            }
            Spacer(modifier = Modifier.height(20.dp))

            Column(
                verticalArrangement = Arrangement.Top,
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.fillMaxWidth()
            ) {
                ButtonComponent(stringResource(R.string.register_sign_up),
                    modifier = Modifier.width(300.dp))}
            }

             Spacer(modifier = Modifier.height(10.dp))

        Column(
            modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            SmallButton(stringResource(R.string.register_account),
                modifier = Modifier.width(300.dp))


        }

        Column (
            modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center)
        {
            Text(
                text = stringResource(R.string.login_continue),
                color = Color.Blue,
                fontSize = MaterialTheme.typography.bodySmall.fontSize,
                fontWeight = FontWeight.SemiBold
            )

            Row (horizontalArrangement = Arrangement.spacedBy(20.dp),
                verticalAlignment = Alignment.CenterVertically,){
                SocialComponent(R.drawable.google,Modifier.width(50.dp))
                SocialComponent(R.drawable.facebook,Modifier.width(50.dp))
                SocialComponent(R.drawable.apple,Modifier.width(50.dp))
            }
        }





        }
    }
