package br.edu.ifpb.pdm.yuri.appbarpratica

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import br.edu.ifpb.pdm.yuri.appbarpratica.ui.theme.AppBarPraticaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AppBarPraticaTheme {
                AppBarExample()
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AppBarExample() {
    Scaffold(
        topBar = {
            // Implementação da TopAppBar (Barra de cima)
            TopAppBar(
                title = { Text("Pequena Barra de App", color = Color.White) },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = Color(0xFF6200EA)
                ),
                navigationIcon = {
                    IconButton(onClick = { /* Ação de navegação */ }) {
                        Icon(Icons.Default.ArrowBack, contentDescription = "Voltar", tint = Color.White)
                    }
                },
                actions = {
                    IconButton(onClick = { /* Ação do botão */ }) {
                        Icon(Icons.Default.Search, contentDescription = "Buscar", tint = Color.White)
                    }
                }
            )
        },
        bottomBar = {
            // Implementação da BottomAppBar (Barra de baixo)
            BottomAppBar(
                containerColor = Color(0xFF03DAC5),
                contentColor = Color.White,
                actions = {
                    IconButton(onClick = { /* Ação de checar */ }) {
                        Icon(Icons.Default.Check, contentDescription = "Confirmar", tint = Color.White)
                    }
                    IconButton(onClick = { /* Ação de editar */ }) {
                        Icon(Icons.Default.Edit, contentDescription = "Editar", tint = Color.White)
                    }
                }
            )
        },
        floatingActionButton = {
            FloatingActionButton(
                onClick = { /* Ação do botão flutuante */ },
                containerColor = Color(0xFF018786)
            ) {
                Icon(Icons.Default.Add, contentDescription = "Adicionar", tint = Color.White)
            }
        }
    ) { innerPadding ->
        Text(
            modifier = Modifier.padding(innerPadding),
            text = "Conteúdo da tela com TopAppBar e BottomAppBar",
            style = MaterialTheme.typography.bodyLarge
        )
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewAppBarExample() {
    AppBarPraticaTheme {
        AppBarExample()
    }
}
