package ui.task.month.order

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import data.AddressModel
import data.ProductModel
import data.model.OrderItemModel
import util.ElisaColor

private val exampleWeekScheduleItemList = listOf(
    OrderItemModel(
        id = 1,
        customer = "Ковалев Артем Александр",
        address = AddressModel(
            index = "012445",
            region = "Ростовская обл.",
            town = "Усть-Донецкий",
            street = "ул Устроителей",
            house = 66
        ),
        phoneNumber = "+7-321-563-67-11",
        productList = listOf(
            ProductModel(
                productName = "Цемент мешок 5 кг",
                unit = "Штуки",
                count = 3
            ),
            ProductModel(
                productName = "Цемент мешок 50 кг",
                unit = "Штуки",
                count = 10
            ),
            ProductModel(
                productName = "Цемент мешок 50 кг",
                unit = "Штуки",
                count = 10
            ),
        ),
        dateDelivery = "26.11.2025",
        typeDelivery = "Грузовой",
    ),
    OrderItemModel(
        id = 1,
        customer = "Зуев Петр Михайлович",
        address = AddressModel(
            index = "012445",
            region = "Московская обл.",
            town = "Пушкино",
            street = "ул Победителей",
            house = 12
        ),
        phoneNumber = "+7-391-111-67-11",
        productList = listOf(
            ProductModel(
                productName = "Цемент мешок 5 кг",
                unit = "Штуки",
                count = 3
            ),
            ProductModel(
                productName = "Цемент мешок 50 кг",
                unit = "Штуки",
                count = 10
            ),
        ),
        dateDelivery = "26.11.2025",
        typeDelivery = "Грузовой",
    ),
    OrderItemModel(
        id = 1,
        customer = "Ковалев Артем Александр",
        address = AddressModel(
            index = "012445",
            region = "Ростовская обл.",
            town = "Усть-Донецкий",
            street = "ул Устроителей",
            house = 66
        ),
        phoneNumber = "+7-321-563-67-11",
        productList = listOf(
            ProductModel(
                productName = "Цемент мешок 5 кг",
                unit = "Штуки",
                count = 3
            ),
            ProductModel(
                productName = "Цемент мешок 50 кг",
                unit = "Штуки",
                count = 10
            ),
            ProductModel(
                productName = "Цемент мешок 50 кг",
                unit = "Штуки",
                count = 10
            ),
        ),
        dateDelivery = "26.11.2025",
        typeDelivery = "Грузовой",
    ),
    OrderItemModel(
        id = 1,
        customer = "Зуев Петр Михайлович",
        address = AddressModel(
            index = "012445",
            region = "Московская обл.",
            town = "Пушкино",
            street = "ул Победителей",
            house = 12
        ),
        phoneNumber = "+7-391-111-67-11",
        productList = listOf(
            ProductModel(
                productName = "Цемент мешок 5 кг",
                unit = "Штуки",
                count = 3
            ),
            ProductModel(
                productName = "Цемент мешок 50 кг",
                unit = "Штуки",
                count = 10
            ),
        ),
        dateDelivery = "26.11.2025",
        typeDelivery = "Грузовой",
    ),
    OrderItemModel(
        id = 1,
        customer = "Ковалев Артем Александр",
        address = AddressModel(
            index = "012445",
            region = "Ростовская обл.",
            town = "Усть-Донецкий",
            street = "ул Устроителей",
            house = 66
        ),
        phoneNumber = "+7-321-563-67-11",
        productList = listOf(
            ProductModel(
                productName = "Цемент мешок 5 кг",
                unit = "Штуки",
                count = 3
            ),
            ProductModel(
                productName = "Цемент мешок 50 кг",
                unit = "Штуки",
                count = 10
            ),
            ProductModel(
                productName = "Цемент мешок 50 кг",
                unit = "Штуки",
                count = 10
            ),
        ),
        dateDelivery = "26.11.2025",
        typeDelivery = "Грузовой",
    ),
    OrderItemModel(
        id = 1,
        customer = "Зуев Петр Михайлович",
        address = AddressModel(
            index = "012445",
            region = "Московская обл.",
            town = "Пушкино",
            street = "ул Победителей",
            house = 12
        ),
        phoneNumber = "+7-391-111-67-11",
        productList = listOf(
            ProductModel(
                productName = "Цемент мешок 5 кг",
                unit = "Штуки",
                count = 3
            ),
            ProductModel(
                productName = "Цемент мешок 50 кг",
                unit = "Штуки",
                count = 10
            ),
        ),
        dateDelivery = "26.11.2025",
        typeDelivery = "Грузовой",
    ),
    OrderItemModel(
        id = 1,
        customer = "Ковалев Артем Александр",
        address = AddressModel(
            index = "012445",
            region = "Ростовская обл.",
            town = "Усть-Донецкий",
            street = "ул Устроителей",
            house = 66
        ),
        phoneNumber = "+7-321-563-67-11",
        productList = listOf(
            ProductModel(
                productName = "Цемент мешок 5 кг",
                unit = "Штуки",
                count = 3
            ),
            ProductModel(
                productName = "Цемент мешок 50 кг",
                unit = "Штуки",
                count = 10
            ),
            ProductModel(
                productName = "Цемент мешок 50 кг",
                unit = "Штуки",
                count = 10
            ),
        ),
        dateDelivery = "26.11.2025",
        typeDelivery = "Грузовой",
    ),
    OrderItemModel(
        id = 1,
        customer = "Зуев Петр Михайлович",
        address = AddressModel(
            index = "012445",
            region = "Московская обл.",
            town = "Пушкино",
            street = "ул Победителей",
            house = 12
        ),
        phoneNumber = "+7-391-111-67-11",
        productList = listOf(
            ProductModel(
                productName = "Цемент мешок 5 кг",
                unit = "Штуки",
                count = 3
            ),
            ProductModel(
                productName = "Цемент мешок 50 кг",
                unit = "Штуки",
                count = 10
            ),
        ),
        dateDelivery = "26.11.2025",
        typeDelivery = "Грузовой",
    )
)

@Composable
fun OrderTable(
    itemList: List<OrderItemModel> = exampleWeekScheduleItemList,
    fieldWidthList: List<Dp>,
) {
    LazyColumn(
        modifier = Modifier
            .padding(start = 10.dp, end = 10.dp, bottom = 10.dp)
            .height(350.dp)
            .fillMaxWidth()
            .border(
                width = 0.5.dp,
                color = ElisaColor.DarkBlue,
            ),
        userScrollEnabled = true,
    ) {
        itemList.forEachIndexed { index, item ->
            item {
                OrderItemList(
                    item = item,
                    color = if (index % 2 == 0)
                        Pair(ElisaColor.White, ElisaColor.LightBlue)
                    else
                        Pair(ElisaColor.LightBlue, ElisaColor.White),
                    fieldWidthList = fieldWidthList,
                )
            }
        }
    }
}