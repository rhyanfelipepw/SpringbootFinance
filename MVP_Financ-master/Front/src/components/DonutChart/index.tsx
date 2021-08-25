import Chart from 'react-apexcharts';
import React, { useEffect, useState } from 'react';
import api from '../../api';
import { DespesaSoma } from '../../types/despesa';

type ChartData = {
    labels: string[];
    series: number[];
}


const DonutChart = () => {


    const [chartData, setChartData] = useState<ChartData>({ labels: [], series: []});

    useEffect( () => {

        async function despesaByCategoria() {
            
            await api.get('despesas/amount-by-categoria', {
                auth: {
                  username: 'lucas',
                  password: '1234'
                }
              }).then((response: { data: DespesaSoma[]; }) => {
                const data = response.data as DespesaSoma[];
                const myLabels = data.map(x => x.categoriaNome);
                const mySeries = data.map(x => x.soma);

                setChartData({ labels: myLabels, series: mySeries})
            });
        
        }

        despesaByCategoria();

    }, []);

    const options = {
        legend: {
            show: true
        }
    }

    return (

        <Chart 
        options={{ ...options, labels: chartData.labels}}
        series={chartData.series}
        type="donut"
        height="200"
    />

    );
}

export default DonutChart;