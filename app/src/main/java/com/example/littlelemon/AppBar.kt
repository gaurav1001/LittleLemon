package com.example.littlelemon

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun TopAppBar(){
    Row(horizontalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically
        ) {
        IconButton(onClick = { /*TODO*/ }) {
            Icon(painter = painterResource(id = R.drawable.baseline_menu_24),
                contentDescription = "menu",
                modifier = Modifier.size(28.dp)
                )
        }
        Image(painter = painterResource(id = R.drawable.original_lemon),
            contentDescription = "logo",
            modifier = Modifier.fillMaxWidth(.5f).padding(horizontal = 20.dp))
        IconButton(onClick = { /*TODO*/ }) {
            Icon(painter = painterResource(id = R.drawable.baseline_shopping_basket_24),
                contentDescription = "cart",
                modifier = Modifier.size(28.dp)
                )
        }
    }
}

@Preview
@Composable
fun TopAppBarPreview(){
    TopAppBar()
}
