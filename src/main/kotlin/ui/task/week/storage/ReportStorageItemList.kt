package ui.task.week.storage

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import data.model.ReportStorageModel
import ui.common.ElisaDivider
import ui.common.ElisaTextItem

@Composable
fun ReportStorageItemList(
    item: ReportStorageModel,
    color: Pair<Color, Color>,
    fieldWidthList: List<Dp>,
) {
    Row(
        modifier = Modifier
            .height(40.dp)
            .fillMaxWidth()
            .clickable {}
            .background(color = color.first),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        ElisaTextItem(
            text = item.id.toString(),
            textWidth = fieldWidthList[0],
        )
        ElisaDivider(
            color = color.second,
            isHorizontal = false,
        )
        ElisaTextItem(
            text = item.article,
            textWidth = fieldWidthList[1],
        )
        ElisaDivider(
            color = color.second,
            isHorizontal = false,
        )
        ElisaTextItem(
            text = item.productName,
            textWidth = fieldWidthList[2],
        )
        ElisaDivider(
            color = color.second,
            isHorizontal = false,
        )
        ElisaTextItem(
            text = item.unit,
            textWidth = fieldWidthList[3],
        )
        ElisaDivider(
            color = color.second,
            isHorizontal = false,
        )
        ElisaTextItem(
            text = item.count.toString(),
            textWidth = fieldWidthList[4],
        )
        ElisaDivider(
            color = color.second,
            isHorizontal = false,
        )
        ElisaTextItem(
            text = item.price.toString(),
            textWidth = fieldWidthList[5],
        )
        ElisaDivider(
            color = color.second,
            isHorizontal = false,
        )
        ElisaTextItem(
            text = item.total.toString(),
            textWidth = fieldWidthList[6],
        )
        ElisaDivider(
            color = color.second,
            isHorizontal = false,
        )
        ElisaTextItem(
            text = item.checkDate,
            textWidth = fieldWidthList[7],
        )
        ElisaDivider(
            color = color.second,
            isHorizontal = false,
        )
        ElisaTextItem(
            text = item.checkerFio,
            textWidth = fieldWidthList[8],
        )
    }
}